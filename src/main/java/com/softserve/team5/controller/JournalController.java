package com.softserve.team5.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softserve.team5.entity.Journal;
import com.softserve.team5.service.interfaces.BookService;
import com.softserve.team5.service.interfaces.JournalService;
import com.softserve.team5.service.interfaces.UserService;

@Controller
@RequestMapping("/journal")
public class JournalController {

    private final JournalService journalService;
    private final UserService userService;
    private final BookService bookService;

    @Autowired
    public JournalController(JournalService journalService, UserService userService, BookService bookService) {
        this.journalService = journalService;
        this.userService = userService;
        this.bookService = bookService;
    }

    @GetMapping
    public String fullJournal(Model model) {
        model.addAttribute("requests", journalService.getAllRequests());
        return "journal/allRequests";
    }

    @GetMapping("/debt")
    public String noReturnBook(Model model) {
        model.addAttribute("list", journalService.usersWhoDidNoReturnBookOnTime());
        return "journal/noReturnBook";
    }

    @GetMapping("/add")
    public String addRequest(@ModelAttribute("journal") Journal journal, Model model) {
        model.addAttribute("users", userService.getAllEntities());
        model.addAttribute("books", bookService.getAllEntities());
        return "journal/addRequest";
    }

    @PostMapping
    public String add(@RequestParam(value = "user") Long userId,
                      @RequestParam(value = "book") Long bookId) {
        journalService.addRequest(userService.getById(userId), bookService.getById(bookId));
        return "redirect:/journal";
    }

	@GetMapping("/avgNumberOfRequestsInPeriod")
	public String numberOfRequestsInPeriod(@RequestParam(value = "start") String start,
			@RequestParam(value = "end") String end, Model model) {
		if (start.isEmpty() || end.isEmpty()) {
			model.addAttribute("dateIsEmptyError", "Dates cant be emty");
			return "forward:/manager";
		}
		LocalDate s = LocalDate.parse(start, DateTimeFormatter.ISO_DATE);
		LocalDate e = LocalDate.parse(end, DateTimeFormatter.ISO_DATE);
		if (s.isAfter(e)) {
			model.addAttribute("startIsAfterEndError", "Start date must be before end date");
			return "forward:/manager";
		}
		model.addAttribute("avgNumberOfRequests", journalService.averengeNumberOfRequestsInPeriod(s, e));
		return "forward:/manager";
	}
	
    @PatchMapping("/giveBook/{id}")
    public String giveBook(@PathVariable("id") Long id) {
        journalService.giveBook(id);
        return "redirect:/journal";
    }

    @PatchMapping("/returnBook/{id}")
    public String returnBook(@PathVariable("id") Long id) {
        journalService.returnBook(id);
        return "redirect:/journal";
    }

	@GetMapping("/booksInPeriod")
	public String booksInPeriod(@RequestParam(value = "start") String start, @RequestParam(value = "end") String end,
			@RequestParam(value = "mostPopular") boolean isMostPopularSelected, Model model) {
		if (start.isEmpty() || end.isEmpty()) {
			model.addAttribute("dateIsEmptyError", "Dates cant be emty");
			return "forward:/books";
		}
		LocalDate s = LocalDate.parse(start, DateTimeFormatter.ISO_DATE);
		LocalDate e = LocalDate.parse(end, DateTimeFormatter.ISO_DATE);
		if (s.isAfter(e)) {
			model.addAttribute("startIsAfterEndError", "Start date must be before end date");
			return "forward:/books";
		}
		if (isMostPopularSelected) {
			model.addAttribute("books", journalService.getMostPopularBooks(s, e));
			return "journal/booksInPeriod";
		}
		model.addAttribute("books", journalService.getMostUnPopularBooks(s, e));
		return "journal/booksInPeriod";
	}

}
