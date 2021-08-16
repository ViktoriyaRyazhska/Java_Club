package ua.ilkanych.libraryproject.service.impl;

import org.springframework.stereotype.Service;
import ua.ilkanych.libraryproject.dao.RoleDao;
import ua.ilkanych.libraryproject.model.Role;
import ua.ilkanych.libraryproject.service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role getById(Long id) {
        return roleDao.getById(id);
    }

    @Override
    public List<Role> getAll() {
        return roleDao.getAll();
    }
}
