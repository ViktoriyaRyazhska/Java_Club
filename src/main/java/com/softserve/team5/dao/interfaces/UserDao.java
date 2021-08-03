package com.softserve.team5.dao.interfaces;

import com.softserve.team5.entity.User;

import java.util.List;

public interface UserDao extends DefaultDaoOpearations<User> {
	double getAverageUsersAge();
}
