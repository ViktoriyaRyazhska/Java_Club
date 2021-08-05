package com.softserve.team5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softserve.team5.service.interfaces.UserService;

@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	private UserService userSerive;

    @GetMapping()
    public String showAllBooks(Model model) {
        return "main";
    }

    @GetMapping("/manager")
    public String goToManagerPage(Model model) {
    	userSerive.getAverengeUsersAge();
    	model.addAttribute("avgUsersAge", userSerive.getAverengeUsersAge());
        return "manager";
    }
}
