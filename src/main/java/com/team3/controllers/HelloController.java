package com.team3.controllers;

import com.team3.entity.User;
import com.team3.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showMainPage( Model model,Authentication authentication) {
        if(authentication!=null) model.addAttribute("user",userService.getUserByEmail(authentication.getName()).getName());
        else model.addAttribute("user","anonim");
        return "hello";
    }



    @GetMapping("users/{id}")
    public String getUser(Model model, @PathVariable Long id){
        model.addAttribute("user",userService.getUserById(id));
        return "users/user";
    }
}
