package com.softserve.team5.dao.interfaces;

import java.time.LocalDate;

import com.softserve.team5.entity.User;

public interface UserDao extends DefaultDaoOpearations<User>{
	LocalDate howLongIsClient(Long id);
	
	double getAverengeUsersAge();
}
