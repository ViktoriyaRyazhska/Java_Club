package com.softserve.team5.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.dao.interfaces.UserDao;
import com.softserve.team5.entity.User;
import com.softserve.team5.service.interfaces.UserService;

import java.util.List;

@Service
@Component
@EnableTransactionManagement
public class UserServiceImpl implements UserService, UserDetailsService {

	private final UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public void create(User user) {
		userDao.create(user);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		userDao.delete(id);
	}

	@Override
	@Transactional
	public void update(User user,Long id) {
		userDao.update(user,id);
	}

	@Override
	@Transactional
	public User getById(Long id) {
		return userDao.getById(id);
	}

	@Override
	public List<User> getAllEntities() {
		return userDao.getAllEntities();
	}

	@Override
	@Transactional
	public double getAverengeUsersAge() {
		return userDao.getAverageUsersAge();
	}

	@Override
	public int isClientFor(Long user_id) {
		return userDao.isClientFor(user_id);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.loadUserByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User '" + username + "' not found.");
		}
		return user;
	}

}
