package com.team3.service;

import com.team3.entity.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User findUserByEmail(String email);

}
