package com.team3.controllers;

import com.team3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/show")
    public String showAllBooks(Model model) {
        model.addAttribute("books", bookService.findAll());

        return "book/bookAll";
    }
}