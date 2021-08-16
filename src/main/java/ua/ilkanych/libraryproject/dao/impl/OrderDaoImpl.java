package ua.ilkanych.libraryproject.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ua.ilkanych.libraryproject.dao.OrderDao;
import ua.ilkanych.libraryproject.model.Order;

import java.time.LocalDateTime;
import java.util.List;

@Transactional
@EnableTransactionManagement
@Repository
public class OrderDaoImpl implements OrderDao {

    private final SessionFactory sessionFactory;

    public OrderDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Order create(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.save(order);
        giveBook(session, order.getBook().getId());

        return order;
    }

    @Override
    public void returnBook(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Order order = getById(id);
        order.getBook().setCopies(order.getBook().getCopies() + 1);
        order.setReturnDate(LocalDateTime.now());
        session.update(order);

    }

    @Override
    public void giveBook(Session session, Long id) {
        session.createQuery("update Book b set b.copies = b.copies - 1 where b.id =: id")
                .setParameter("id", id)
                .executeUpdate();
    }


    @Transactional(readOnly = true)
    @Override
    public Order getById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Order.class, id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Order> getAll() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select o from Order o", Order.class)
                .getResultList();
    }

    @Override
    public Order delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Order order = getById(id);
        session.remove(order);
        return order;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Order> getOrderByUser(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select o from Order o where o.user.id =: id", Order.class)
                .setParameter("id", id)
                .getResultList();
    }
}
