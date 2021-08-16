package ua.ilkanych.libraryproject.service;

import org.hibernate.Session;
import ua.ilkanych.libraryproject.model.Order;

import java.util.List;

public interface OrderService {

    Order create(Order order);

    void returnBook(Long id);

    void giveBook(Session session, Long id);

    Order getById(Long id);

    List<Order> getAll();

    Order delete(Long id);

    List<Order> getOrderByUser(Long id);
}
