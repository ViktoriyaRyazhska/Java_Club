package com.team3.controllers;

import com.team3.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping()
    @PreAuthorize(value = "hasAnyAuthority('ADMIN','MANAGER')")
    public String getAllOrders(Model model) {
        model.addAttribute("orders", orderService.findAllOrders());
        return "orders/orders";
    }

    @GetMapping("/{id}")
    @PreAuthorize(value = "hasAnyRole('ADMIN','MANAGER')")
    public String findById(@PathVariable("id") Long id, Model model) {
        model.addAttribute("order", orderService.findByOrderId(id));
        return "orders/order";
    }

    @PostMapping("/{id}")
    @PreAuthorize(value = "hasAuthority('MANAGER')")
    public String borrowBookToUser(@PathVariable Long id) {
        orderService.borrowBook(id);
        return "redirect:/orders";
    }

    @PostMapping("/return/{id}")
    @PreAuthorize(value = "hasAnyAuthority('MANAGER')")
    public String returnBookToLibrary(@PathVariable Long id) {
        orderService.returnBook(id);
        return "redirect:/orders";
    }
}