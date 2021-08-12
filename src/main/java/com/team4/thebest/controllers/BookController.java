package com.team4.thebest.controllers;

import com.team4.thebest.models.Book;
import com.team4.thebest.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/book-form")
    public String showForm(Model model) {
        model.addAttribute("book", new Book());
        return "book/bookform";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @PostMapping("/save")
    public String save(@ModelAttribute("book") Book book) {
        bookService.save(book);
        return "redirect:/modify-books";
    }

    @GetMapping("/view-books")
    public String viewBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book/viewbooks";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/modify-books")
    public String modifyBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book/modifybooks";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/edit-book/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        return "book/bookeditform";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @PostMapping("/edit-save")
    public String editSave(@ModelAttribute("book") Book book) {
        bookService.update(book);
        return "redirect:/modify-books";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/delete-book/{id}")
    public String delete(@PathVariable Long id) {
        bookService.delete(id);
        return "redirect:/modify-books";
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam String keyword) {
        List<Book> result = bookService.search(keyword);
        ModelAndView modelAndView = new ModelAndView("book/search");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
