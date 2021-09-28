package com.team3.dao;

import com.team3.entity.Book;
import com.team3.entity.Order;
import com.team3.entity.User;

import java.util.List;

public interface OrderDao {
    void addOrder(Order order);

    void deleteOrder(Long id);

    Order findOrderById(Long id);

    List<Order> findAllOrders();

    int getCountOfRepeatedOrders(Long user, Long book);
}
