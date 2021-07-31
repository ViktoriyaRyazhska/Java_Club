package com.library.service.impl;

import com.library.entity.RentStatus;
import com.library.entity.User;
import com.library.repository.UserRepository;
import com.library.service.UserService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User findByIdFetchRentInfo(Long id) {
        return userRepository.findByIdFetchRentInfo(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User remove(Long id) {
        return userRepository.remove(id);
    }

    @Override
    public Integer daysOurClient(Long id) {
        return userRepository.daysOurClient(id);
    }

    @Override
    public Integer amountReadBooks(Long id) {
        return userRepository.amountReadBooks(id);
    }

    @Override
    public Optional<Double> readingTimeOfBooks(RentStatus rentStatus, Long id) {
        return userRepository.readingTimeOfBooks(rentStatus, id);
    }

    @Override
    public Integer averageAge() {
        return userRepository.averageAge();
    }

    @Override
    public Integer averageTimeWorkingWithLibrary() {
        return userRepository.averageTimeWorkingWithLibrary();
    }

    @Override
    public List<User> findAllWithExpiredStatus() {
        return userRepository.findAllWithExpiredStatus();
    }
}
