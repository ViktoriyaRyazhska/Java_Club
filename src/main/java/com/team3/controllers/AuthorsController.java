package com.team3.controllers;


import com.team3.dao.AuthorDao;
import com.team3.entity.Author;
import com.team3.service.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/author")
public class AuthorsController {

    private final AuthorsService authorsService;

    @Autowired
    public AuthorsController(AuthorsService authorsService) {
        this.authorsService = authorsService;
    }


    @GetMapping("/show")
    public String showAllAuthors(Model model) {
        model.addAttribute("authors", authorsService.findAll());
        return "author/authorAll";
    }

    @GetMapping("/{id}")
    public String showAuthorsById(@PathVariable("id") int id, Model model) {
        Author author = authorsService.findById(id);
        model.addAttribute("author", author);
        return "author/authorShowById";
    }

    @GetMapping("/add")
    public String newAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "author/authorAdd";
    }

    @PostMapping("/add")
    public String create(@ModelAttribute("author") Author author) {
        authorsService.save(author);
        return "redirect: show";
    }

}
