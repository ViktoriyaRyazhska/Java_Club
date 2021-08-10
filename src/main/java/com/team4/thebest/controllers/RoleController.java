package com.team4.thebest.controllers;

import com.team4.thebest.services.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class RoleController {

    private final RoleService roleService;

//    @PreAuthorize("hasAnyAuthority('ADMIN', 'MANAGER')")
    @GetMapping("/role")
    public String roleForm(Model model) {
        model.addAttribute("roles", roleService.list());
        return "displayRoles";
    }
}
