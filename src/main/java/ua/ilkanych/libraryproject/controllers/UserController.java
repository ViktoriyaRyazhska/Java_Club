package ua.ilkanych.libraryproject.controllers;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ua.ilkanych.libraryproject.model.Order;
import ua.ilkanych.libraryproject.model.User;
import ua.ilkanych.libraryproject.service.OrderService;
import ua.ilkanych.libraryproject.service.RoleService;
import ua.ilkanych.libraryproject.service.UserService;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final RoleService roleService;
    private final OrderService orderService;

    public UserController(UserService userService, PasswordEncoder passwordEncoder, RoleService roleService, OrderService orderService) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
        this.orderService = orderService;
    }


    @GetMapping("/newUser")
    public String newUser(@ModelAttribute("user") User user) {

        return "user/newUser";
    }

    @PostMapping("/newUser")
    public String registration(@ModelAttribute("user") @Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "user/newUser";
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(roleService.getById(1L));
        user.setCreatedAt(LocalDateTime.now());
        userService.create(user);
        return "redirect:/user/" + user.getId();
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model){
        model.addAttribute("user", userService.getById(id));
        return "user/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("user") User user, BindingResult result, Model model){
        User user1= userService.getById(user.getId());
        if(result.hasErrors()){
            return "user/edit";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(roleService.getById(1L));
        user.setCreatedAt(user1.getCreatedAt());
        userService.create(user);

        model.addAttribute("users", userService.getAllUsers());

        return "user/allUsers";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        userService.delete(id);
        SecurityContextHolder.clearContext();
        return "redirect:/login";
    }

    @GetMapping
    public String myCabinet(Model model){
        model.addAttribute("users", userService.getAllUsers());

        return "user/allUsers";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("/allUsers")
    public String allUsers(Model model){
        model.addAttribute("users", userService.getAllUsers());

        return "user/allUsersAdm";
    }

    @PreAuthorize("hasAuthority('ADMIN') or hasAnyAuthority('USER') and authentication.principal.id == #id")
    @GetMapping("/cabinet/{id}")
    public String getUserInfo(@PathVariable("id") Long id, Model model){
        User user = userService.getById(id);
        model.addAttribute("user", user);
        Long getNumberOfBooksRead = userService.getNumberOfBooksRead(id);
        model.addAttribute("numberOfBooksRead", getNumberOfBooksRead);
        Integer getTotalDays = userService.howLongIsOurClient(id);
        model.addAttribute("totalDays", getTotalDays);
        Long getTotalBookReadingTime = userService.getTotalBookReadingTime(id);
        model.addAttribute("readingTime", getTotalBookReadingTime);
        List<Order> orders = orderService.getOrderByUser(id);
        model.addAttribute("orders", orders);

        return "user/cabinet";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN') ")
    @GetMapping("/debtors")
    public String getAllDebtors(Model model) {
        List<User> users = userService.getAllDebtors();
        model.addAttribute("users", users);
        return "user/allDebtors";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("/getStatistic")
    public String getAll(Model model) {
        Double avgAge = userService.getAvgAge();

        model.addAttribute("avgAge", avgAge);
        return "user/statisticAdm";
    }
}
