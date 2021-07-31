package com.team4.thebest.dao;

import com.team4.thebest.models.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    List<User> list();
}
