package com.team4.thebest.dao;

import com.team4.thebest.models.Role;
import com.team4.thebest.models.RoleType;

public interface RoleDao {
    Role findById(Long id);

    Role getByRoleType(RoleType roleType);
}
