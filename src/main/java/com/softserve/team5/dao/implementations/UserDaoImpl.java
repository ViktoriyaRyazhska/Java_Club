package com.softserve.team5.dao.implementations;

import com.softserve.team5.dao.interfaces.UserDao;
import com.softserve.team5.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.List;

@Repository
@EnableTransactionManagement
@Transactional
public class UserDaoImpl implements UserDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(User entity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
	}

	@Override
	public void update(User user, Long id) {
		User userToBeUpdated = getById(id);
		userToBeUpdated.setName(user.getName());
		userToBeUpdated.setEmail(user.getEmail());
		userToBeUpdated.setBirthday(user.getBirthday());
		userToBeUpdated.setPassword(user.getPassword());
	}

	@Override
	public void delete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		User user = getById(id);
		if (user != null)
			session.delete(user);
	}

	@Override
	public User getById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllEntities() {
		Session session = sessionFactory.getCurrentSession();
		return (List<User>) session.createQuery("from User").list();
	}

	@Override
	public double getAverageUsersAge() {
		Session session = sessionFactory.getCurrentSession();
		return (double) session.createQuery("select avg(year(current_date)-year(u.birthday)) from User u")
				.getSingleResult();
	}

	@Override
	public int isClientFor(Long user_id) {
		User u = getById(user_id);
		return Period.between(u.getRegistrationDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
				LocalDate.now()).getYears();

	}

	@Override
	public User loadUserByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		return (User) session.createQuery("select u from User u where u.email=:mail").setParameter("mail", username)
				.getSingleResult();
	}

}
