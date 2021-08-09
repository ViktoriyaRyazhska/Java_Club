package com.team3.controllers;


import com.team3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BooksController {
    BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/show")
    public String showAllBooks(Model model){
        model.addAttribute("books",bookService.findAll());

        return "/book/bookAll";
    }

}
