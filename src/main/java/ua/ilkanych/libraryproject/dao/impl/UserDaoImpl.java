package ua.ilkanych.libraryproject.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ua.ilkanych.libraryproject.dao.UserDao;
import ua.ilkanych.libraryproject.model.User;

import java.util.List;

@Transactional
@EnableTransactionManagement
@Repository
public class UserDaoImpl implements UserDao {

    private final SessionFactory sessionFactory;

    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User create(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select u from User u", User.class)
                .getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public User getById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(User.class, id);
    }

    @Transactional(readOnly = true)
    @Override
    public User getByName(String name) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select u from User u where u.username=:name", User.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user = getById(id);
        session.delete(user);
    }

    @Transactional(readOnly = true)
    @Override
    public Long getNumberOfBooksRead(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Long) session.createQuery("select count(distinct o.book.title) from Order o where o.user.id =:id and o.returnDate is null")
                .setParameter("id",id)
                .getSingleResult();
    }

    @Transactional(readOnly = true)
    @Override
    public Long getTotalBookReadingTime(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return (Long) session.createQuery("select sum(datediff(o.returnDate, o.rentDate)) " +
                "from Order o where o.user.id =:id and o.returnDate is not null")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Transactional(readOnly = true)
    @Override
    public Integer howLongIsOurClient(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return (Integer) session.createQuery("select datediff(current_timestamp, u.createdAt)" +
                "from User u where u.id=:id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Transactional(readOnly = true)
    @Override
    public Double getAvgAge() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select avg(u.age)" +
                "from User u", Double.class)
                .getSingleResult();
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllDebtors() {
        Session session = sessionFactory.getCurrentSession();

            return session.createQuery("select o.user " +
                            "from Order o where (o.requiredReturnDate < current_timestamp) and o.returnDate is null ", User.class)
                    .getResultList();
    }
}
