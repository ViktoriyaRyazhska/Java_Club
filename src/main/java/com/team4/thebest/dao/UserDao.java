package com.team4.thebest.dao;

import com.team4.thebest.models.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    UserDetails getUserByUsername(String username);

    void save(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void update(User user);

    void delete(Long id);

    List<User> findUserByUserName(String keyword);

    User findById(Long userId);

    Integer amountReadBooks(Long id);

    Optional<Double> readingTimeOfBooks(Long id);

    Integer daysOurClient(Long id);

    Integer amountOfBooksUserIsReading(Long id);

    List<User> getDebtors();
}
