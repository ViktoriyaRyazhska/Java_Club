package com.team4.thebest.services;

import com.team4.thebest.models.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> list();
}
