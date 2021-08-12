package com.team3.controllers;


import com.team3.entity.Author;
import com.team3.entity.Book;
import com.team3.entity.BookAuthor;
import com.team3.service.AuthorsService;
import com.team3.service.BookService;
import net.bytebuddy.matcher.StringMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BooksController {
    BookService bookService;
    AuthorsService authorsService;

    @Autowired
    public BooksController(BookService bookService, AuthorsService authorsService) {
        this.bookService = bookService;
        this.authorsService = authorsService;
    }

    @GetMapping("/show")
    public String showAllBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "/book/bookAll";
    }

    @PostMapping("/show")
    public String showSortedBook(@RequestParam(value = "name")String name, Model model){
        model.addAttribute("books",bookService.findBooksByAuthor(name));
        return "/book/bookAll";
    }

    @GetMapping("/add")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("author", authorsService.findAll());
        return "book/bookAdd";
    }

    @PostMapping("/add")
    public String createBook(@ModelAttribute("book") Book book, Model Model) {
        bookService.save(book);
        return "redirect: show";
    }


    @GetMapping("/{id}")
    public String showBookById(@PathVariable("id") int id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "book/bookById";
    }

}
