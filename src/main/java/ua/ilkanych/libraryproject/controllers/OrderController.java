package ua.ilkanych.libraryproject.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.ilkanych.libraryproject.model.Order;
import ua.ilkanych.libraryproject.model.User;
import ua.ilkanych.libraryproject.service.BookService;
import ua.ilkanych.libraryproject.service.OrderService;
import ua.ilkanych.libraryproject.service.UserService;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class OrderController {

    private final OrderService orderService;
    private final UserService userService;
    private final BookService bookService;

    public OrderController(OrderService orderService, UserService userService, BookService bookService) {
        this.orderService = orderService;
        this.userService = userService;
        this.bookService = bookService;
    }

    @GetMapping("/give/{id}/{user_id}")
    public String giveBook(@PathVariable Long id, @PathVariable("user_id") Long uId, Model model) {
        Order order = new Order();
        order.setUser(userService.getById(uId));
        order.setBook(bookService.getById(id));
        order.setRentDate(LocalDateTime.now());
        order.setRequiredReturnDate(LocalDateTime.now().plusDays(10));
        orderService.create(order);

        model.addAttribute("allBook", bookService.getAll());
        return "redirect:/getAllBooks";
    }

    @PatchMapping("/order/return/{id}")
    public String returnBook(@PathVariable("id") Long id, Authentication authentication){
        User user = (User) authentication.getPrincipal();
        orderService.returnBook(id);
        return "redirect:/user/cabinet/" + user.getId();
    }

    @GetMapping("/myBooks/{id}")
    public String getOrderByUser(@PathVariable Long id, Model model){
        List<Order> orders = orderService.getOrderByUser(id);
        model.addAttribute("orders", orders);
        return "user/myBooks" + id;
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/order/getAll")
    public String getAll(Model model) {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orders", orders);
        return "order/allOrdersAdm";
    }
}
