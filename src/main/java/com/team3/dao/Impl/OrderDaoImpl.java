package com.team3.dao.Impl;

import com.team3.dao.OrderDao;
import com.team3.entity.Order;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
    public int getCountOfRepeatedOrders(Long user, Long book) {
        Query<Order> query = sessionFactory.getCurrentSession().createQuery("select a from Order a WHERE a.user.id=:user and a.book.bookId=:book");
        query.setParameter("user", user)
                .setParameter("book", book);
        return query.getResultList().size();
    }
}