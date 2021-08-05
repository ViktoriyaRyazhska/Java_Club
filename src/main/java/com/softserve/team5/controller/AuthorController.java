package com.softserve.team5.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softserve.team5.entity.Author;
import com.softserve.team5.service.interfaces.AuthorService;
import com.softserve.team5.service.interfaces.BookService;


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
        model.addAttribute("allAuthors",authorService.getAllEntities());
        return "author/allAuthors";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Long id, Model model){
        model.addAttribute("books",authorService.getBooksByAuthor(id));
        model.addAttribute("author",authorService.getById(id));
        return "author/oneAuthor";
    }

    @GetMapping("/new")
    public String newAuthor(@ModelAttribute("author") Author author){
    	
        return "author/newAuthor";
    }

    @PostMapping()
    public String create(@ModelAttribute("author") @Valid Author author, BindingResult bindingResult) {
    	if(bindingResult.hasErrors()) {
			return "author/newAuthor";
    	}
        authorService.create(author);
        return "redirect:/author";
    }

}
