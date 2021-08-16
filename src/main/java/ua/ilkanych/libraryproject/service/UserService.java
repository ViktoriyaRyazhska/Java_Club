package ua.ilkanych.libraryproject.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.ilkanych.libraryproject.model.User;

import java.util.List;
public interface UserService  extends UserDetailsService
{
    User create(User user);

    List getAllUsers();

    User getById(Long id);

    User getByName(String name);

    void delete(Long id);

    Long getNumberOfBooksRead(Long id);

    Long getTotalBookReadingTime(Long id);

    Integer howLongIsOurClient(Long id);

    Double getAvgAge();

    List<User>getAllDebtors();
}
