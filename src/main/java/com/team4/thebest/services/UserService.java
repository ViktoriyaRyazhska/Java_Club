package com.team4.thebest.services;

import com.team4.thebest.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {

    void save(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void update(User user);

    void delete(Long id);

    List<User> search(String keyword);

    User findById(Long userId);

    Integer amountReadBooks(Long id);

    Optional<Double> readingTimeOfBooks(Long id);

    Integer daysOurClient(Long id);

    Integer amountOfBooksUserIsReading(Long id);

    List<User> getDebtors();
}
