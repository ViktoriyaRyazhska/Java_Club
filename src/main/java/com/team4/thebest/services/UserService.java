package com.team4.thebest.services;

import com.team4.thebest.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> list();
}
