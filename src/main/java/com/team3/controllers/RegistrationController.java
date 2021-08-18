package com.team3.controllers;

import com.team3.entity.User;
import com.team3.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    /* @GetMapping()
     public String getAllUsers(Model model){
         model.addAttribute("users",userService.getAllUsers());
         return "users/users";
     }
     @GetMapping("/{id}")
     public String getUserById(@PathVariable Long id,Model model){
         model.addAttribute("user",userService.getUserById(id));
         return "users/user";
     }*/
    @GetMapping("/new")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "users/addUser";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "users/addUser";
        }
        if (!user.getPassword().equals(user.getPasswordConfirm())) {
            model.addAttribute("passwordError", "Password is not equals!");
            return "users/addUser";
        }
        if (!userService.addUser(user)) {
            model.addAttribute("emailError", "User already exist!");
            return "users/addUser";
        }
        return "redirect:/login";
    }
}