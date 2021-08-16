package ua.ilkanych.libraryproject.dao;

import org.hibernate.Session;
import ua.ilkanych.libraryproject.model.Order;

import java.util.List;

public interface OrderDao {

    Order create(Order order);

    void returnBook(Long id);

    void giveBook(Session session, Long id);

    Order getById(Long id);

    List<Order> getAll();

    Order delete(Long id);

    List<Order> getOrderByUser(Long id);
}
