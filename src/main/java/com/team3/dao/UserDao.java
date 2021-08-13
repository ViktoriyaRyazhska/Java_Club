package com.team3.dao;


import com.team3.entity.Role;
import com.team3.entity.User;

import java.util.List;

public interface UserDao {

    public void addUser(User user);
    public User getUserById(Long id);
    public List<User> getAllUsers();
    Role getRoleById(Long id);
    Role getRoleByName(String name);
    void setRole(String name);
}
