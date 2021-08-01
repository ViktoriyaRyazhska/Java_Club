package com.softserve.team5.dao.interfaces;

import com.softserve.team5.entity.User;

public interface UserDao extends DefaultDaoOpearations<User> {
	double getAverageUsersAge();
}
