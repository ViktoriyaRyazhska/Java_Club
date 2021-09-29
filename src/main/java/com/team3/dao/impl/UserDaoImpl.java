package com.team3.dao.impl;

import com.team3.dao.UserDao;
import com.team3.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.util.List;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

    private final SessionFactory sessionFactory;

    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("select a from User a join fetch a.roles", User.class).getResultList();
    }
    @Transactional(readOnly = true)
    @Override
    public User findUserByEmail(String email) {
        User user;
        try {
            user = sessionFactory.getCurrentSession().createQuery("select a from User a join fetch a.roles where a.email=:email", User.class)
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (NoResultException e) {
            user = null;
        }
        return user;
    }
}