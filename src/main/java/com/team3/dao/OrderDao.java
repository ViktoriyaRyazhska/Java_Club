package com.team3.dao;

import com.team3.entity.Order;

public interface OrderDao {
    void addOrder(Order order);
    void deleteOrder(Long id);
    Order findOrderById(Long id);
}
