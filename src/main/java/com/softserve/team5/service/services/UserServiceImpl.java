package com.softserve.team5.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.dao.interfaces.UserDao;
import com.softserve.team5.entity.User;
import com.softserve.team5.service.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public void create(User user) {
		this.userDao.create(user);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		this.userDao.delete(id);
	}

	@Override
	@Transactional
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	@Transactional
	public User getById(Long id) {
		return this.userDao.getById(id);
	}

	@Override
	@Transactional
	public double getAverengeUsersAge() {
		// TODO Auto-generated method stub
		return 0;
	}
}
