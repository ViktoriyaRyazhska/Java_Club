package com.team3.service;

import com.team3.entity.Book;
import com.team3.entity.Order;
import com.team3.entity.User;

import java.util.List;

public interface OrderService {
    void getTheMostPopularBook();

    void getTheMostUnpopularBook();

    void getHowManyBooksWereBeenReadByUser(Long id);

    void getHowManyBooksWereGivingInSelectedPeriod();

    boolean reserveBook(Order order, User user, Book book);

    void deleteOrder(Long id);

    Order findByOrderId(Long id);

    List<Order> findAllOrders();
}