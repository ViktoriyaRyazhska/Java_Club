package ua.ilkanych.libraryproject.dao;

import ua.ilkanych.libraryproject.model.Role;

import java.util.List;

public interface RoleDao {

    Role getById(Long id);
    List<Role> getAll();
}
