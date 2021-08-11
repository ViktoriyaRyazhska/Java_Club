package com.team4.thebest.services.impl;

import com.team4.thebest.dao.RoleDao;
import com.team4.thebest.models.Role;
import com.team4.thebest.services.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    @Override
    public List<Role> list() {
        return roleDao.list();
    }

    @Override
    public Role findById(Long id) {
        return roleDao.findById(id);
    }
}
