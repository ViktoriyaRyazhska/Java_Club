package com.team4.thebest.services.impl;

import com.team4.thebest.dao.UserDao;
import com.team4.thebest.models.User;
import com.team4.thebest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }

    public List<User> list() {
        return userDao.list();
    }
}
