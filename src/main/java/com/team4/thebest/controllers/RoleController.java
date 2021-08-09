package com.team4.thebest.controllers;

import com.team4.thebest.models.Role;
import com.team4.thebest.services.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @GetMapping("/role")
    public String roleForm(Model model) {
        List<Role> list = roleService.list();
        for (Role role : list) {
            System.out.println(role);
        }
        model.addAttribute("roles", list);
        return "roles";
    }
}
