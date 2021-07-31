package com.library.repository;

import com.library.entity.Role;

import java.util.List;

public interface RoleRepository {
    Role findById(Long id);

    List<Role> findAll();
}
