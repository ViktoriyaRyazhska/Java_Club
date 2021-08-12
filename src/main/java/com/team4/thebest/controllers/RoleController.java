package com.team4.thebest.controllers;

import com.team4.thebest.services.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class RoleController {

    private final RoleService roleService;
}
