package com.team3.controllers;


import com.team3.dao.AuthorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/author")
public class AuthorsController {

    private final AuthorDao authorDao;

    @Autowired
    public AuthorsController(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @GetMapping("/show")
    public String showAuthors(Model model){
        model.addAttribute("authors", authorDao.findAll());
        return "authorsAll";
    }

    @GetMapping("/{id}")
    public String showAuthorsById(@PathVariable("id")int id, Model model){
        model.addAttribute("author",authorDao.findById(id));
        return "show_author";
    }

}
