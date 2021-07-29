package com.softserve.team5.service;

import com.softserve.team5.dao.UserDao;
import com.softserve.team5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void create(User user) {
        this.userDao.create(user);
    }

    public void delete(User user) {
        this.userDao.delete(user);
    }

}
