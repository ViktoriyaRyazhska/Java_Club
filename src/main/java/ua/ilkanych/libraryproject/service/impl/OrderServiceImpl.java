package ua.ilkanych.libraryproject.service.impl;

import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ua.ilkanych.libraryproject.dao.OrderDao;
import ua.ilkanych.libraryproject.model.Order;
import ua.ilkanych.libraryproject.service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao;

    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public Order create(Order order) {
        return orderDao.create(order);
    }

    @Override
    public void returnBook(Long id) {
        orderDao.returnBook(id);
    }

    @Override
    public void giveBook(Session session, Long id) {
        orderDao.giveBook(session,id);
    }

    @Override
    public Order getById(Long id) {
        return orderDao.getById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderDao.getAll();
    }

    @Override
    public Order delete(Long id) {
        return delete(id);
    }

    @Override
    public List<Order> getOrderByUser(Long id) {
        return orderDao.getOrderByUser(id);
    }
}
