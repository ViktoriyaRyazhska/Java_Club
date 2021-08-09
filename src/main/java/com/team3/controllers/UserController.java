package com.team3.controllers;

import com.team3.entity.User;
import com.team3.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    private UserService userService;

    @GetMapping()
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.getAllUsers());
        return "users/users";
    }
    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id,Model model){
        model.addAttribute("user",userService.getUserById(id));
        return "users/user";
    }
    @GetMapping("/new")
    public String addUser(@ModelAttribute("user")User user){
        return "users/addUser";
    }
    @PostMapping()
    public String create(@ModelAttribute("user")User user){
        userService.addUser(user);
        return "redirect:/users";
    }
}