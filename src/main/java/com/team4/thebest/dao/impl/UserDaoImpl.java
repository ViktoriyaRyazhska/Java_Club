package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.UserDao;
import com.team4.thebest.models.User;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
@AllArgsConstructor
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    @Override
    public User getUserByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select u from User u where u.username=:username", User.class)
                .setParameter("username", username)
                .getSingleResult();
    }
}
