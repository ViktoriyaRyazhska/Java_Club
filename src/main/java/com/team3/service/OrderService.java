package com.team3.service;

import com.team3.entity.Order;

import java.util.List;

public interface OrderService {
    void getTheMostPopularBook();
    void getTheMostUnpopularBook();
    void getHowManyBooksWereBeenReadByUser(Long id);
    void getHowManyBooksWereGivingInSelectedPeriod();
    void addOrder(Order order);
    void deleteOrder(Long id);
    Order findByOrderId(Long id);
    List<Order> findAllOrders();
}