package com.softserve.team5.dao.implementations;

import com.softserve.team5.dao.interfaces.UserDao;
import com.softserve.team5.entity.User;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void create(User entity) {
		
	}

	@Override
	public void update(User entity) {
		
	}

	@Override
	public void delete(Long id) {
		
	}

	@Override
	public User getById(Long id) {
		return null;
	}

	@Override
	public LocalDate howLongIsClient(Long id) {
		return null;
	}

	@Override
	public double getAverengeUsersAge() {
		return 0;
	}
	
	/*
	 * private final SessionFactory sessionFactory;
	 * 
	 * @Autowired public UserDaoImpl(SessionFactory sessionFactory) {
	 * this.sessionFactory = sessionFactory; }
	 * 
	 * @Override public void create(User user) { Session session =
	 * this.sessionFactory.getCurrentSession(); session.persist(user); }
	 * 
	 * @Override public void delete(User user) { Session session =
	 * this.sessionFactory.getCurrentSession(); session.delete(user); }
	 * 
	 * @Override public User getById(Long id) { Session session =
	 * this.sessionFactory.getCurrentSession(); return session.load(User.class, id);
	 * }
	 * 
	 * 
	 * @Override public void update(User user) { Session session =
	 * sessionFactory.getCurrentSession(); session.update(user); }
	 */

	
}
