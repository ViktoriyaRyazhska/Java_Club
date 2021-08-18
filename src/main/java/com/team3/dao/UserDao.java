package com.team3.dao;


import com.team3.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User findUserByEmail(String email);
}
