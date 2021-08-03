package com.softserve.team5.controller;

import com.softserve.team5.service.interfaces.AuthorService;
import com.softserve.team5.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService authorService;
    private final BookService bookService;

    @Autowired
    public AuthorController(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }


    @GetMapping
    public String getAll(Model model){
        model.addAttribute("allAuthors",authorService.getAllAuthors());
        return "author/allAuthors";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Long id, Model model){
        model.addAttribute("books",authorService.getBooksByAuthor(id));
        model.addAttribute("author",authorService.getById(id));
        return "author/oneAuthor";
    }
}
