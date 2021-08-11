package com.team4.thebest.services;

import com.team4.thebest.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> list();

    Role findById(Long id);
}
