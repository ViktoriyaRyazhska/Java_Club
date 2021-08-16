package ua.ilkanych.libraryproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.ilkanych.libraryproject.dao.UserDao;
import ua.ilkanych.libraryproject.model.User;
import ua.ilkanych.libraryproject.service.UserService;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    public List getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public User getByName(String name) {
        return userDao.getByName(name);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public Long getNumberOfBooksRead(Long id) {
        return userDao.getNumberOfBooksRead(id);
    }

    @Override
    public Long getTotalBookReadingTime(Long id) {
        return userDao.getTotalBookReadingTime(id);
    }

    @Override
    public Integer howLongIsOurClient(Long id) {
        return userDao.howLongIsOurClient(id);
    }

    @Override
    public Double getAvgAge() {
        return userDao.getAvgAge();
    }

    @Override
    public List<User> getAllDebtors() {
        return userDao.getAllDebtors();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        try {
            return userDao.getByName(s);
        } catch (NoResultException e) {
            throw new UsernameNotFoundException("User not found!");
        }
    }
}
