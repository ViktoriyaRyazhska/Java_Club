package com.team4.thebest.controllers;

import com.team4.thebest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

//    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/user")
    public String userForm(Model model) {
        model.addAttribute("users", userService.list());
        return "displayUsers";
    }
}
