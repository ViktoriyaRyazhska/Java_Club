package com.team3.service.impl;

import com.team3.dao.UserDao;
import com.team3.entity.Role;
import com.team3.entity.User;
import com.team3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    PasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(PasswordEncoder bCryptPasswordEncoder1, UserDao userDao) {
        this.userDao = userDao;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder1;
    }

    @Override
    public boolean addUser(User user) {
        User userFromDb = userDao.findUserByEmail(user.getEmail());
        if (userFromDb != null) {
            return false;
        }
        user.setRoles(Collections.singleton(new Role(1L, "USER")));
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        user.setRegistrationDate(date);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userDao.addUser(user);
        return true;
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
    @Transactional
    @Override
    public User getUserByEmail(String email){
        return userDao.findUserByEmail(email);
    }
}