package com.team3.dao.impl;

import com.team3.dao.OrderDao;
import com.team3.entity.Order;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    private final SessionFactory sessionFactory;

    public OrderDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addOrder(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        Order order = findOrderById(id);
        sessionFactory.getCurrentSession().remove(order);
    }

    @Override
    public Order findOrderById(Long id) {
        return sessionFactory.getCurrentSession().get(Order.class, id);
    }

    @Override
    public List<Order> findAllOrders() {
        return sessionFactory.getCurrentSession().createQuery("select a from Order a", Order.class).getResultList();
    }

    @Override
    public List<Order> getUsersRepeatedOrders(Long user, Long book) {
        return sessionFactory.getCurrentSession()
                .createQuery("select a from Order a WHERE a.user.id=:user and a.book.bookId=:book",Order.class)
                .setParameter("user", user)
                .setParameter("book", book)
                .getResultList();
    }

    @Override
    public List<Order> getHowManyBooksWereBeenReadByUser(String email) {
        return sessionFactory.getCurrentSession().createQuery(
                "select a from Order a where a.user.email=:email " +
                        "and a.orderStatus<>'RESERVED' " +
                        "and a.orderStatus<>'CANCELED'",Order.class)
                .setParameter("email", email)
                .getResultList();
    }
}