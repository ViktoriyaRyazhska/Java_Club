package com.softserve.team5.controller;

import com.softserve.team5.dto.BookDto;
import com.softserve.team5.service.interfaces.AuthorService;
import com.softserve.team5.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.softserve.team5.entity.Book;
import javax.validation.Valid;

@Controller
@RequestMapping("/books")
public class BookController {

	private final BookService bookService;
	private final AuthorService authorService;

	@Autowired
	public BookController(BookService bookService, AuthorService authorService) {
		this.bookService = bookService;
		this.authorService = authorService;
	}

	@GetMapping()
	public String showAllBooks(Model model) {
		model.addAttribute("books", bookService.getAllEntities());
		return "books/allBooks";
	}

	@GetMapping("/{id}")
	public String showOneBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", bookService.getById(id));
		model.addAttribute("author", bookService.getMainAuthorByBookId(id));
		model.addAttribute("coAuthors", bookService.getCoAuthorsByBookId(id));
		return "books/oneBook";
	}

	@GetMapping("/findBookByTitle")
	public String findBookByTitle(@RequestParam(value = "title") String title, Model model) {
		Book book = bookService.findByTitle(title);
		if(book == null) {
			model.addAttribute("bookNotFound", "Book not found");
			return "forward:/books";
		}
		return "redirect:/books/"+book.getId();
	}

	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable("id") Long id, Model model) {
		bookService.delete(id);
		model.addAttribute("books", bookService.getAllEntities());
		return "books/allBooks";
	}

	@GetMapping("/new")
	public String newBook(@ModelAttribute("bookDto") BookDto bookDto, Model model) {
		model.addAttribute("authors", authorService.getAllEntities());
		return "books/newBook";
	}

	@PostMapping()
	public String create(@ModelAttribute("bookDto") @Valid BookDto bookDto, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("authors", authorService.getAllEntities());
			return "books/newBook";
		}
		bookService.createFromDto(bookDto);
		return "redirect:/books";
	}
}
