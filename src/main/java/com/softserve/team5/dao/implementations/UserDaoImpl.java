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
        session.persist(entity);
    }

    @Override
    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        user.setRegistrationDate(LocalDate.now());
        session.update(user);
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user = getById(id);
        if (user != null) session.delete(user);
    }

    @Override
    public User getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public double getAverageUsersAge() {
        return 0;
    }
}
