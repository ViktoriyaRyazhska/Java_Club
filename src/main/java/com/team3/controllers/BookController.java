package com.team3.controllers;

import com.team3.entity.Book;
import com.team3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/books")
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

    @GetMapping("/search")
    public ModelAndView showBooksByAuthorName(@RequestParam(required = false, value = "name") String name) {
        List<Book> list = bookService.findBooksByAuthor(name);
        ModelAndView mav = new ModelAndView("book/bookByAuthor");
        mav.addObject("list", list);
        return mav;
    }
}