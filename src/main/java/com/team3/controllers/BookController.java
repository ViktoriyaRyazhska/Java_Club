package com.team3.controllers;

import com.team3.entity.Book;
import com.team3.entity.Order;
import com.team3.entity.User;
import com.team3.service.BookService;
import com.team3.service.OrderService;
import com.team3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;
    private final OrderService orderService;
    private final UserService userService;

    @Autowired
    public BookController(BookService bookService,OrderService orderService,UserService userService) {
        this.bookService = bookService;
        this.orderService= orderService;
        this.userService=userService;
    }

    @GetMapping("/show")
    public String showAllBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "book/bookAll";
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable Long id, Model model){
        model.addAttribute("book",bookService.findById(id));
        return "book/bookById";
    }

    @GetMapping("/search")
    public ModelAndView showBooksByAuthorName(@RequestParam(required = false, value = "name") String name) {
        List<Book> list = bookService.findBooksByAuthor(name);
        ModelAndView mav = new ModelAndView("book/bookByAuthor");
        mav.addObject("list", list);
        return mav;
    }
    @PostMapping("/{id}/reserveBook")
    public String reserveBooks(@PathVariable("id") Long id,Model model,Order order,Authentication authentication){
        Book book=bookService.findById(id);
        User user=userService.getUserByEmail(authentication.getName());
        if (!orderService.reserveBook(order,user,book)){
            return "orders/failConfirm";
        }
        else {
            return "redirect:/books/successOrderCreation";
        }
    }
    @GetMapping("/{id}/reserveBook")
    public String reserveSuccess(@PathVariable("id") Long id, Model model){
        Book book=bookService.findById(id);
        model.addAttribute("book",book);
        model.addAttribute("order",new Order());
        return "orders/confirmation";
    }

    @GetMapping("/successOrderCreation")
    public String successOrder(){
        return "orders/takeBook";
    }
}