package com.team4.thebest.dao;

import com.team4.thebest.models.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserDao {
    void save(User user);

    List<User> list();

    UserDetails getUserByUsername(String username);
}
