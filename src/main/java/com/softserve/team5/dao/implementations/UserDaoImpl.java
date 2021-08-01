package com.softserve.team5.dao.implementations;

import com.softserve.team5.dao.interfaces.UserDao;
import com.softserve.team5.entity.User;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.request.SessionScope;

@Repository
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;

	@Override
	public void create(User entity) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(entity);
	}

	@Override
	public void update(User entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);

	}

	@Override
	public void delete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.load(User.class,new Long(id));
		if (user != null){
			session.delete(user);
		}
	}

	@Override
	public User getById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.load(User.class,new Long(id));
		return user;
	}

	@Override
	public LocalDate howLongIsClient(Long id) {
		return null;
	}

	@Override
	public double getAverengeUsersAge() {
		return 0;
	}

	@Override
	public String getEmail() {
		return null;
	}

	@Override
	public String getName() {
		return null;
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
