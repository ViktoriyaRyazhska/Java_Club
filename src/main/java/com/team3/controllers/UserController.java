package com.team3.controllers;

import com.team3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final BookService bookService;

    @Autowired
    public UserController(BookService bookService) {
        this.bookService = bookService;
    }


}
