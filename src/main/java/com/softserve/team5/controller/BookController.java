package com.softserve.team5.controller;

import com.softserve.team5.entity.Book;
import com.softserve.team5.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

	private final BookService bookService;
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping()
	public String showAllBooks(Model model) {
		model.addAttribute("books", bookService.getAllBooks());
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
		model.addAttribute("books", bookService.getAllBooks());
		return "books/allBooks";
	}

	@GetMapping("/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "books/newBook";
	}

	@PostMapping()
	public String create(@ModelAttribute("book") Book book) {
		bookService.create(book);
		return "redirect:/books";
	}
}
