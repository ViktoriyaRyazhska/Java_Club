package com.softserve.team5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softserve.team5.dao.interfaces.BookDao;
import com.softserve.team5.entity.Book;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookDao bookDao;

	@GetMapping()
	public String showAllBooks(Model model) {
		model.addAttribute("books", bookDao.getAllBooks());
		return "books/allBooks";
	}

	@GetMapping("/{id}")
	public String showOneBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", bookDao.getById(id));
		return "books/oneBook";
	}

	@GetMapping("/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "books/newBook";
	}

	@PostMapping()
	public String create(@ModelAttribute("book") Book book) {
		bookDao.create(book);
		return "redirect:/books";
	}
}
