package com.softserve.team5.service;

import com.softserve.team5.dao.UserDao;
import com.softserve.team5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void create(User user) {
        this.userDao.create(user);
    }

    public void delete(User user) {
        this.userDao.delete(user);
    }

    public void update(User user) {
        this.userDao.update(user);
    }

    public User getById(Long id) {
        return this.userDao.getById(id);
    }
}
