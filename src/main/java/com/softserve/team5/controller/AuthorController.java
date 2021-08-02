package com.softserve.team5.controller;

import com.softserve.team5.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping("/allAuthors")
    public String getAllAuthors(Model model){
        model.addAttribute("allAuthors",authorService.getAllAuthors());
        return "author/allAuthors";
    }
}
