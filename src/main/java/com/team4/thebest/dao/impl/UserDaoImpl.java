package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.UserDao;
import com.team4.thebest.models.User;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@AllArgsConstructor
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Override
    public void save(User user) {
        final Session session = sessionFactory.getCurrentSession();
        final Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
    }

    @Override
    public List<User> list() {
        final Session session = sessionFactory.getCurrentSession();
        final Transaction transaction = session.beginTransaction();

        try {
            @SuppressWarnings("unchecked")
            final TypedQuery<User> query = session.createQuery("from User");
            return query.getResultList();
        } finally {
            transaction.commit();
        }
    }
}
