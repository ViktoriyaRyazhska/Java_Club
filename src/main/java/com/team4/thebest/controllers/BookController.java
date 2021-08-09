package com.team4.thebest.controllers;

import com.team4.thebest.models.Book;
import com.team4.thebest.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class BookController {

    private BookService bookService;

    @GetMapping("/")
    public String bookForm(Model model) {
        model.addAttribute("books", bookService.list());
        return "editBooks";
    }

    @ModelAttribute("book")
    public Book formBackingObject() {
        return new Book();
    }

    @PostMapping("/addBook")
    public String saveBook(@ModelAttribute("book") @Valid Book book, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("books", bookService.list());
            return "editBooks";
        }

        bookService.save(book);
        return "redirect:/";
    }
}
