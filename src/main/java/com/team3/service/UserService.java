package com.team3.service;

import com.team3.entity.Role;
import com.team3.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    Role getRoleById(Long id);

    Role getRoleByName(String name);

    void addDefaultUser(User user);
}
