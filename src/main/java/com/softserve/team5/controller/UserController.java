package com.softserve.team5.controller;

import com.softserve.team5.entity.Role;
import com.softserve.team5.entity.User;
import com.softserve.team5.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
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

    @GetMapping("/{id}")
    public String showOneUser(@PathVariable("id")Long id,Model model){
        model.addAttribute("user",userService.getById(id));
        return "/users/oneUser";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id,Model model){
        userService.delete(id);
        model.addAttribute("users",userService.getAllEntities());
        return "/users/allUsers";
    }


    @GetMapping("/{id}/edit")
    public String editUser(@PathVariable("id") Long id,Model model){
        model.addAttribute("user",userService.getById(id));
        return "/users/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user,@PathVariable("id")Long id){
        userService.update(user,id);
        return "redirect:/users";
    }

    @GetMapping("/newUser")
    public String newUser(@ModelAttribute("user") User user){
        return "users/newUser";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user, BindingResult bindingResult,Model model) {
       /* if (bindingResult.hasErrors()){
            model.addAttribute("user",userService.getAllEntities());
            return "users/newUser";
        }*/
        user.setRole(Role.USER);
        user.setRegistrationDate(Date.valueOf(LocalDate.now()));
        userService.create(user);
        return "redirect:/users";
    }



}
