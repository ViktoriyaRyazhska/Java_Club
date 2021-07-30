package com.softserve.team5.dao;

import com.softserve.team5.entity.User;

import java.util.List;

public interface UserDao {
    void create(User user);
    void delete(User user);
    User getById(Long id);
    void update(User user);
}
