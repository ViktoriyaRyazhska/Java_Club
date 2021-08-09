package com.team4.thebest.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserService implements UserDetailsService {

    private List<User> users = Arrays.asList(
            new User(1L, "mike",
                    "$2a$12$EXSY2a2Hf8/tYxjQawAtUOUMyPhl7T.tWkUtr6JpcctZ7sG1Lbt76", new Role("ROLE_WRITER")),
            new User(2L, "nick",
                    "$2a$12$dOfSpIm8NvUr04WLXiErzuA5T0UhHx/7bmk/Yykur4bL3jUCnUm8.", new Role("ROLE_READER"))
    );

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst().orElse(null);

        if (user == null) {
            throw new UsernameNotFoundException("User not found!");
        }
        return user;
    }
}
