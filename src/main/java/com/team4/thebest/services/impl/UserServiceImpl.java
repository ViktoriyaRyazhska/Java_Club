package com.team4.thebest.services.impl;

import com.team4.thebest.dao.UserDao;
import com.team4.thebest.models.User;
import com.team4.thebest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            return userDao.getUserByUsername(username);
        } catch (NoResultException e) {
            throw new UsernameNotFoundException("User not found!");
        }
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public List<User> search(String keyword) {
        return userDao.findUserByUserName(keyword);
    }

    @Override
    public User findById(Long userId) {
        return userDao.findById(userId);
    }
}
