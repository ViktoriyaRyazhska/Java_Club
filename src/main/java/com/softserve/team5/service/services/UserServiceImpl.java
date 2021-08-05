package com.softserve.team5.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.dao.interfaces.UserDao;
import com.softserve.team5.entity.User;
import com.softserve.team5.service.interfaces.UserService;

import java.util.List;

@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {

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
	public void update(User user) {
		userDao.update(user);
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
}
