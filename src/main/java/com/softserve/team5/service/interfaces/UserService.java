package com.softserve.team5.service.interfaces;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.softserve.team5.entity.User;

public interface UserService extends UserDetailsService{
	double getAverengeUsersAge();

	int isClientFor(Long user_id);
	
	void create(User entity);

	void update(User entity,Long id);

	void delete(Long id);

	User getById(Long id);

	List<User> getAllEntities();
}
