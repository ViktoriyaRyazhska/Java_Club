package com.softserve.team5.controller;

import com.softserve.team5.entity.Role;
import com.softserve.team5.entity.User;
import com.softserve.team5.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public String allUsers(Model model){
        model.addAttribute("users",userService.getAllEntities());
        return "users/allUsers";
    }

    @GetMapping("/newUser")
    public String newUser(@ModelAttribute("user") User user){
        return "users/newUser";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {

        user.setRole(Role.USER);
        user.setRegistrationDate(LocalDate.now());
        userService.create(user);
        return "redirect:/users";
    }
}
