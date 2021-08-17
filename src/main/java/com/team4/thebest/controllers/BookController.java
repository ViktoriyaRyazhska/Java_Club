package com.team4.thebest.controllers;

import com.team4.thebest.models.Book;
import com.team4.thebest.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

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
    public String save(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "book/bookform";
        }
        book.setPublished(LocalDateTime.now(ZoneId.of("Europe/Kiev")));
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
    public String editSave(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "book/bookeditform";
        }
        bookService.update(book);
        return "redirect:/modify-books";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/delete-book/{id}")
    public String delete(@PathVariable Long id) {
        bookService.delete(id);
        return "redirect:/modify-books";
    }

    @GetMapping("/book/search")
    public ModelAndView search(@RequestParam String keyword) {
        List<Book> result = bookService.search(keyword);
        ModelAndView modelAndView = new ModelAndView("book/viewbooks");
        modelAndView.addObject("books", result);
        return modelAndView;
    }

    @GetMapping("/book/time-search")
    public ModelAndView timeSearch(@RequestParam String from, @RequestParam String to) {
        ModelAndView modelAndView = new ModelAndView("book/modifybooks");
        if (from.isBlank() || to.isBlank()) {
            modelAndView.addObject("wrongInput", "Pass required date");
            modelAndView.addObject("books", bookService.getAllBooks());
            return modelAndView;
        }
        LocalDateTime fromParsed = LocalDate.parse(from).atTime(LocalTime.MIN);
        LocalDateTime toParsed = LocalDate.parse(to).atTime(LocalTime.MAX);
        if (fromParsed.isAfter(toParsed)) {
            modelAndView.addObject("wrongInput", "Wrong date range");
            modelAndView.addObject("books", bookService.getAllBooks());
            return modelAndView;
        }
        List<Book> result = bookService.timeSearch(fromParsed, toParsed);
        modelAndView.addObject("books", result);
        return modelAndView;
    }

    @GetMapping("book/{id}")
    public String read(@PathVariable Long id, Model model) {
        Book book = bookService.findById(id);

        Integer amountOfReaders = bookService.amountOfReaders(id);
        Integer amountOfUsersReadingBookNow = bookService.amountOfUsersReadingBookNow(id);
        Optional<Long> sumOfBookReadingTime = bookService.sumOfBookReadingTime(id);
        Book theMostPopular = bookService.getTheMostPopular();
        Book theMostUnpopular = bookService.getTheMostUnpopular();


        model.addAttribute("book", book);
        model.addAttribute("amountOfReaders", amountOfReaders);
        model.addAttribute("amountOfBooksBookIsReading", amountOfUsersReadingBookNow);
        sumOfBookReadingTime
                .ifPresent(t -> model.addAttribute("sumOfBookReadingTime", t));
        model.addAttribute("theMostPopular", theMostPopular);
        model.addAttribute("theMostUnpopular", theMostUnpopular);

        return "book/bookinfo";
    }
}
