package com.team3.controllers;

import com.team3.entity.User;
import com.team3.service.BookService;
import com.team3.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final BookService bookService;
    private final OrderService orderService;

    @Autowired
    public UserController(BookService bookService, OrderService orderService) {
        this.bookService = bookService;
        this.orderService = orderService;
    }

    @GetMapping("/statistic")
    public String getStatistic(Authentication authentication, Model model) {
        String user = authentication.getName();
        model.addAttribute("bookCount", orderService.getHowManyBooksWereBeenReadByUser(user));
        return "users/userStatistic";
    }
}