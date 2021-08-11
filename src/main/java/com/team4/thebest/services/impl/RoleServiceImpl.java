package com.team4.thebest.services.impl;

import com.team4.thebest.dao.RoleDao;
import com.team4.thebest.models.Role;
import com.team4.thebest.models.RoleType;
import com.team4.thebest.services.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Override
    public Role findById(Long id) {
        return roleDao.findById(id);
    }

    @Override
    public Role getByRoleType(RoleType roleType) {
        return roleDao.getByRoleType(roleType);
    }
}
