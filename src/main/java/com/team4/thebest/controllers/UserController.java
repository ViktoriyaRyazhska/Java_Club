package com.team4.thebest.controllers;

import com.team4.thebest.models.Book;
import com.team4.thebest.models.User;
import com.team4.thebest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public String userForm(Model model) {
        System.out.println("Before userService.list();");
        List<User> userList = userService.list();
        System.out.println("After userService.list();");
        for (User user : userList) {
            System.out.println(user);
        }
        model.addAttribute("users", userList);
        return "displayUsers";
    }
}
