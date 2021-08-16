package ua.ilkanych.libraryproject.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.ilkanych.libraryproject.model.Author;
import ua.ilkanych.libraryproject.service.AuthorService;



@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("/author/create")
    public String create(Model model){
        Author author = new Author();
        model.addAttribute("author", author);

        return "/author/addAuthor";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @PostMapping("/book/create")
    public String create(@ModelAttribute Author author){

        authorService.create(author);

        return "redirect:/author/" + author.getId();
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("author/{id}/delete")
    public String delete(@PathVariable Long id, Model model){
        authorService.delete(id);
        model.addAttribute("allAuthors", authorService.getAll());
        return "author/allAuthors";
    }

    @GetMapping("/getAllAuthors")
    public String getAllAuthors(Model model) {
        model.addAttribute("allAuthors", authorService.getAll());
        return "author/allAuthors";
    }

    @GetMapping("/author/{id}")
    public String getSelectedAuthor(@PathVariable Long id, Model model){
        Author authorBooks = authorService.getAuthorBooks(id);
        model.addAttribute("author", authorService.getById(id));
        model.addAttribute("authorBooks", authorBooks);

        return "author/selectedAuthor";
    }
}
