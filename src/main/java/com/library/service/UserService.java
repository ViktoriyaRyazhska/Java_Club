package com.library.service;

import com.library.entity.RentStatus;
import com.library.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);

    User findById(Long id);

    User findByIdFetchRentInfo(Long id);

    List<User> findAll();

    User remove(Long id);

    Integer daysOurClient(Long id);

    Integer amountReadBooks(Long id);

    Optional<Double> readingTimeOfBooks(RentStatus rentStatus, Long id);

    Integer averageAge();

    Integer averageTimeWorkingWithLibrary();

    List<User> findAllWithExpiredStatus();
}
