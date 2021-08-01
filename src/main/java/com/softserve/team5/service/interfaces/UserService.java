package com.softserve.team5.service.interfaces;

import java.time.LocalDate;

import com.softserve.team5.entity.User;

public interface UserService extends DefaultServiceOperations<User>{
	LocalDate howLongIsClient(Long id);

	double getAverengeUsersAge();
}
