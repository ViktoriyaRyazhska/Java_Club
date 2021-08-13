package com.team3.service.Impl;

import com.team3.dao.UserDao;
import com.team3.entity.Role;
import com.team3.entity.User;
import com.team3.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }




    @Override
    public Role getRoleById(Long id) {
        return userDao.getRoleById(id);
    }

    @Override
    public Role getRoleByName(String name) {
        return userDao.getRoleByName(name);
    }

    @Override
    public void addDefaultUser(User user) {
        Role roleUser=userDao.getRoleByName("USER");
        user.addRole(roleUser);
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        user.setRegistrationDate(date);
        userDao.addUser(user);
    }
}

