package com.team3.dao;

import com.team3.entity.User;

import java.util.List;

public interface UserDao {

    public void addUser(User user);
    public void updateUser(Long id);
    public void deleteUser(Long id);
    public User getUser(Long id);
    public List<User> getAllUsers();
}
