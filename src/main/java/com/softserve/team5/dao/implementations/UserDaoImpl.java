package com.softserve.team5.dao.implementations;

import com.softserve.team5.dao.interfaces.UserDao;
import com.softserve.team5.entity.User;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableTransactionManagement
@Transactional
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
		User user = session.load(User.class, new Long(id));
		if (user != null) {
			session.delete(user);
		}
	}

	@Override
	public User getById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.load(User.class, new Long(id));
		return user;
	}

	@Override
	public double getAverengeUsersAge() {
		return 0;
	}
}
