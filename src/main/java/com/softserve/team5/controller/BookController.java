package com.softserve.team5.controller;

import com.softserve.team5.dto.BookDto;
import com.softserve.team5.entity.Book;
import com.softserve.team5.service.interfaces.AuthorService;
import com.softserve.team5.service.interfaces.BookAuthorService;
import com.softserve.team5.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {

	private final BookService bookService;
	private final AuthorService authorService;
	private final BookAuthorService bookAuthorService;

	@Autowired
	public BookController(BookService bookService, AuthorService authorService, BookAuthorService bookAuthorService) {
		this.bookService = bookService;
		this.authorService = authorService;
		this.bookAuthorService = bookAuthorService;
	}

	@GetMapping()
	public String showAllBooks(Model model) {
		model.addAttribute("books", bookService.getAllEntities());
		return "books/allBooks";
	}

	@PostMapping()
	public String create(@ModelAttribute("bookDto") @Valid BookDto bookDto,
						 BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("authors", authorService.getAllEntities());
			return "books/newBook";
		}
		bookService.createFromDto(bookDto);
		return "redirect:/books";
	}

	@GetMapping("/findBookByTitle")
	public String findBookByTitle(@RequestParam(value = "title") String title, Model model) {
		Book book = bookService.findByTitle(title);
		if (book == null) {
			model.addAttribute("bookNotFound", "Book not found");
			return "forward:/books";
		}
		return "redirect:/books/" + book.getId();
	}

	@GetMapping("/{id}")
	public String showOneBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", bookService.getById(id));
		model.addAttribute("author", bookService.getMainAuthorByBookId(id));
		model.addAttribute("coAuthors", bookService.getCoAuthorsByBookId(id));
		return "books/oneBook";
	}

	@PostMapping("/{id}")
	public String editBook(@PathVariable("id") Long id,
						   @ModelAttribute("bookDto") @Valid BookDto bookDto,
						   BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("book", bookService.getById(id));
			model.addAttribute("mainAuthor", bookService.getMainAuthorByBookId(id));
			model.addAttribute("authors", authorService.getAllEntities());
			return "books/editBook";
		}
		bookService.editFromDto(bookDto, id);

		model.addAttribute("book", bookService.getById(id));
		model.addAttribute("author", bookService.getMainAuthorByBookId(id));
		model.addAttribute("coAuthors", bookService.getCoAuthorsByBookId(id));
		return "books/oneBook";
	}

	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable("id") Long id, Model model) {
		bookService.delete(id);
		model.addAttribute("books", bookService.getAllEntities());
		return "books/allBooks";
	}

	@DeleteMapping("/{id}/{authorId}")
	public String deleteAuthor(@PathVariable("id") Long id,
							   @PathVariable("authorId") Long authorId,
							   Model model) {
		bookAuthorService.deleteAuthor(id, authorId);

		model.addAttribute("book", bookService.getById(id));
		model.addAttribute("author", bookService.getMainAuthorByBookId(id));
		model.addAttribute("coAuthors", bookService.getCoAuthorsByBookId(id));
		return "books/oneBook";
	}


	@GetMapping("/{id}/edit")
	public String editBookShow(@PathVariable("id") Long id,
							   @ModelAttribute("bookDto") BookDto bookDto,
							   Model model) {
		model.addAttribute("book", bookService.getById(id));
		model.addAttribute("mainAuthor", bookService.getMainAuthorByBookId(id));
		model.addAttribute("authors", authorService.getAllEntities());
		return "books/editBook";
	}

	@GetMapping("/new")
	public String newBook(@ModelAttribute("bookDto") BookDto bookDto, Model model) {
		model.addAttribute("authors", authorService.getAllEntities());
		return "books/newBook";
	}

}
