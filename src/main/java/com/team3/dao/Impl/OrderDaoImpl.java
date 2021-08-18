package com.team3.dao.Impl;

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
        return sessionFactory.getCurrentSession().createQuery("SELECT a from Order a", Order.class).getResultList();
    }

}