package com.softserve.team5.service.interfaces;

import com.softserve.team5.entity.User;

import java.util.List;

public interface UserService extends DefaultServiceOperations<User>{
	double getAverengeUsersAge();
}
