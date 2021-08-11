package com.team4.thebest.controllers;

import com.team4.thebest.models.User;
import com.team4.thebest.services.RoleService;
import com.team4.thebest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final RoleService roleService;

    @GetMapping("/create")
    public String userForm() {
        return "editUsers";
    }

    @ModelAttribute("user")
    public User formBackingObject() {
        return new User();
    }

    @PostMapping("/create/addUser")
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("users", userService.list());
            return "editUsers";
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(roleService.findById(1L));

        userService.save(user);
        return "success";
    }

    @GetMapping("/success")
    public String getSuccessPage() {
        return "success";
    }
}
