package com.library.repository.impl;

import com.library.entity.RentStatus;
import com.library.entity.User;
import com.library.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

import static com.library.entity.RentStatus.EXPIRED;
import static com.library.entity.RentStatus.RETURNED;
import static java.util.Optional.*;

@Transactional
@Repository
public class UserRepositoryImpl implements UserRepository {

  private final SessionFactory sessionFactory;

  public UserRepositoryImpl(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  public User save(User user) {
    Session session = sessionFactory.getCurrentSession();

    session.saveOrUpdate(user);

    return user;
  }

  @Transactional(readOnly = true)
  @Override
  public User findById(Long id) {
    Session session = sessionFactory.getCurrentSession();

    return session.get(User.class, id);
  }

  @Transactional(readOnly = true)
  @Override
  public User findByIdFetchRentInfo(Long id) {
    Session session = sessionFactory.getCurrentSession();

    return session.createQuery("select u from User u left join u.rentInfoList where u.id=:id", User.class)
            .setParameter("id", id)
            .getSingleResult();
  }

  @Transactional(readOnly = true)
  @Override
  public List<User> findAll() {
    Session session = sessionFactory.getCurrentSession();

    return session.createQuery("select u from User u", User.class)
            .getResultList();
  }

  @Override
  public User remove(Long id) {
    Session session = sessionFactory.getCurrentSession();

    User user = findById(id);

    session.remove(user);

    return user;
  }

  @Transactional(readOnly = true)
  @Override
  public User getUserByUsername(String username) {
    Session session = sessionFactory.getCurrentSession();

    return session.createQuery("select u from User u where u.username=:username", User.class)
            .setParameter("username", username)
            .getSingleResult();
  }

  @Transactional(readOnly = true)
  @Override
  public Integer daysOurClient(Long id) {
    Session session = sessionFactory.getCurrentSession();

    return (Integer) session.createQuery("select datediff(current_timestamp, u.creationDate) " +
            "from User u where u.id=:id")
            .setParameter("id", id)
            .getSingleResult();

  }

  @Transactional(readOnly = true)
  @Override
  public Integer amountReadBooks(Long id) {
    Session session = sessionFactory.getCurrentSession();

    return session.createQuery("select count(distinct r.book.title) " +
            "from RentInfo r where r.user.id=:id and r.rentStatus=:rentStatus", Long.class)
            .setParameter("id", id)
            .setParameter("rentStatus", RETURNED)
            .getSingleResult()
            .intValue();

  }

  @Transactional(readOnly = true)
  @Override
  public Optional<Double> readingTimeOfBooks(RentStatus rentStatus, Long id) {
    Session session = sessionFactory.getCurrentSession();


    switch (rentStatus) {
      case RETURNED:

        return ofNullable((Double) session.createQuery(
                "select round(avg(datediff(r.returnDate, r.rentDate))) " +
                "from RentInfo r where r.user.id=:id and r.rentStatus=:rentStatus")
                .setParameter("id", id)
                .setParameter("rentStatus", rentStatus)
                .getSingleResult());

      case ACTIVE:

        return ofNullable((Double) session.createQuery(
                        "select round(avg(datediff(current_timestamp, r.rentDate))) " +
                                "from RentInfo r where r.user.id=:id and r.rentStatus=:rentStatus")
                .setParameter("id", id)
                .setParameter("rentStatus", rentStatus)
                .getSingleResult());
    }
    return empty();
  }

  @Transactional(readOnly = true)
  @Override
  public Integer averageAge() {
    Session session = sessionFactory.getCurrentSession();

    return session.createQuery("select avg(u.age) from User u", Double.class)
            .getSingleResult().intValue();
  }

  @Transactional(readOnly = true)
  @Override
  public Integer averageTimeWorkingWithLibrary() {
    Session session = sessionFactory.getCurrentSession();

    return ((Double) session.createQuery("select avg(datediff(current_timestamp, u.creationDate)) from User u")
            .getSingleResult()).intValue();
  }

  @Transactional(readOnly = true)
  @Override
  public List<User> findAllWithExpiredStatus() {
    Session session = sessionFactory.getCurrentSession();

    return session.createQuery("select r.user from RentInfo r where r.rentStatus=:rentStatus", User.class)
            .setParameter("rentStatus", EXPIRED)
            .getResultList();
  }

}
