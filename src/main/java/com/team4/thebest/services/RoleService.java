package com.team4.thebest.services;

import com.team4.thebest.models.Role;
import com.team4.thebest.models.RoleType;

public interface RoleService {
    Role findById(Long id);

    Role getByRoleType(RoleType roleType);
}
