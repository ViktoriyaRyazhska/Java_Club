package com.team4.thebest.controllers;

import com.team4.thebest.models.User;
import com.team4.thebest.services.RoleService;
import com.team4.thebest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final RoleService roleService;
    private final PasswordEncoder encoder;

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/user-form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "user/userform";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @PostMapping("user/save")
    public String save(@ModelAttribute("user") User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole(roleService.findById(1L));
        userService.save(user);
        return "redirect:/view-users";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/view-users")
    public String viewUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "user/viewusers";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/edit-user/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "user/usereditform";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @PostMapping("/edit-savee")
    public String editSave(@ModelAttribute("user") User user) {
        user.setRole(roleService.getByRoleType(user.getRole().getRoleType()));
        userService.update(user);
        return "redirect:/view-users";
    }

    @GetMapping("/delete-user/{id}")
    public String delete(@PathVariable Long id) {
        userService.delete(id);
        return "redirect:/view-users";
    }

    @GetMapping("user/search")
    public ModelAndView search(@RequestParam String keyword) {
        List<User> result = userService.search(keyword);
        ModelAndView modelAndView = new ModelAndView("user/search");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
