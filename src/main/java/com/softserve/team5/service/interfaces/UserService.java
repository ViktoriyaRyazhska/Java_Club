package com.softserve.team5.service.interfaces;

import com.softserve.team5.entity.User;

public interface UserService extends DefaultServiceOperations<User>{
	double getAverengeUsersAge();

	int isClientFor(Long user_id);
}
