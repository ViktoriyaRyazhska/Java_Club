package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.UserDao;
import com.team4.thebest.models.User;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.ofNullable;

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

    @Override
    public void save(User user) {
        final Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        final Session session = sessionFactory.getCurrentSession();

        @SuppressWarnings("unchecked")
        final TypedQuery<User> query = session.createQuery("from User");
        return query.getResultList();
    }

    @Override
    public User getUserById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select b from User b where b.id=:id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(getUserById(id));
    }

    @Override
    public List<User> findUserByUserName(String keyword) {
        Session session = sessionFactory.getCurrentSession();

        String searchKeyword = "%" + keyword + "%";
        return session.createQuery("select u from User u where lower(u.username) like :keyword", User.class)
                .setParameter("keyword", searchKeyword)
                .getResultList();
    }

    @Override
    public User findById(Long userId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, userId);
    }

    @Override
    public Integer amountReadBooks(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select count(distinct r.book.name) " +
                        "from RentInfo r where r.user.id=:id and r.returnDate is not null", Long.class)
                .setParameter("id", id)
                .getSingleResult()
                .intValue();
    }

    @Override
    public Optional<Double> readingTimeOfBooks(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return ofNullable((Double) session.createQuery(
                        "select round(avg(datediff(r.returnDate, r.rentDate))) " +
                                "from RentInfo r where r.user.id=:id and r.returnDate is not null")
                .setParameter("id", id)
                .getSingleResult());
    }

    @Override
    public Integer daysOurClient(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return (Integer) session.createQuery("select datediff(current_timestamp, u.creationDate) " +
                        "from User u where u.id=:id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Integer amountOfBooksUserIsReading(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select count(distinct r.book.name) " +
                        "from RentInfo r where r.user.id=:id and r.returnDate is null", Long.class)
                .setParameter("id", id)
                .getSingleResult()
                .intValue();
    }

    @Override
    public List<User> getDebtors() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select u from User u left join RentInfo r on u.id = r.user.id " +
                        "where r.returnDate > r.requiredReturnDate", User.class)
                .getResultList();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select u from User u where u.username=:username", User.class)
                .setParameter("username", username)
                .stream().findFirst();
    }
}
