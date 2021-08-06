package com.team3.dao.Impl;

import com.team3.dao.UserDao;
import com.team3.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final SessionFactory sessionFactory;

    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User getUserById(Long id) {return sessionFactory.getCurrentSession().get(User.class, id);}

    @Override
    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("select a from User a",User.class).getResultList();
    }

}