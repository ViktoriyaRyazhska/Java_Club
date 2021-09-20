package com.team3.controllers;

import com.team3.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {

    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String showMainPage() {
        return "hello";
    }

    @GetMapping("users/{id}")
    public String getUser(Model model, @PathVariable Long id){
        model.addAttribute("user",userService.getUserById(id));
        return "users/user";
    }
}
