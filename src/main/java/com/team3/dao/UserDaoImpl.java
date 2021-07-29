package com.team3.dao;

import com.team3.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addUser(User user) {
    this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User getUser(Long id) {
    return new User();
    }

    @Override
    public List getAllUsers() {
       return this.sessionFactory.getCurrentSession().createQuery("from User").list();
    }
}
