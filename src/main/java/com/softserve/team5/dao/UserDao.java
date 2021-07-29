package com.softserve.team5.dao;

import com.softserve.team5.entity.User;

public interface UserDao {
    public void create(User user);
    public void delete(User user);
}
