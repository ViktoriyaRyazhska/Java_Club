package ua.ilkanych.libraryproject.service;

import ua.ilkanych.libraryproject.model.Role;

import java.util.List;

public interface RoleService {

    Role getById(Long id);
    List<Role> getAll();
}
