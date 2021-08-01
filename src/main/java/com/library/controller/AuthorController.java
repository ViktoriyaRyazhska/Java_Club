package com.library.controller;

import com.library.entity.Author;
import com.library.service.AuthorService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService authorService;


    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/save")
    public String create(Model model) {
        Author author = new Author();
        model.addAttribute("author", author);
        return "author-form";
    }

    @PostMapping("/save")
    public String create(@Validated @ModelAttribute Author author, BindingResult result) {
        if (result.hasErrors()) {
            return "author-form";
        }
        authorService.save(author);

        return "redirect:/author";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        authorService.remove(id);

        return "redirect:/author";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping
    public String getAll(Model model) {
        List<Author> authors = authorService.findAll();

        model.addAttribute("authors", authors);

        return "author-list";
    }
}
