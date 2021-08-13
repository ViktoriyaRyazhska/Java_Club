package com.team4.thebest.services.impl;

import com.team4.thebest.dao.RentInfoDao;
import com.team4.thebest.dao.UserDao;
import com.team4.thebest.models.User;
import com.team4.thebest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    private final RentInfoDao rentInfoDao;

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
        rentInfoDao.deleteRentByUserId(id);
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

    @Override
    public Integer amountReadBooks(Long id) {
        return userDao.amountReadBooks(id);
    }

    @Override
    public Optional<Double> readingTimeOfBooks(Long id) {
        return userDao.readingTimeOfBooks(id);
    }

    @Override
    public Integer daysOurClient(Long id) {
        return userDao.daysOurClient(id);
    }

    @Override
    public Integer amountOfBooksUserIsReading(Long id) {
        return userDao.amountOfBooksUserIsReading(id);
    }

    @Override
    public List<User> getDebtors() {
        return userDao.getDebtors();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
