package com.team3.dao;

import com.team3.entity.Order;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderDaoImpl implements OrderDao{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void addOrder(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }
}
