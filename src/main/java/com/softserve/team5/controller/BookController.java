package com.softserve.team5.controller;

import javax.validation.Valid;

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

import com.softserve.team5.dto.BookDto;
import com.softserve.team5.service.interfaces.AuthorService;
import com.softserve.team5.service.interfaces.BookService;

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
		return "books/oneBook";
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
		if(bindingResult.hasErrors()) {
			model.addAttribute("authors", authorService.getAllEntities());
			return "books/newBook";
		}
		bookService.createFromDto(bookDto);
		return "redirect:/books";
	}
}
