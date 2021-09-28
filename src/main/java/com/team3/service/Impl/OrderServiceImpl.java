package com.team3.service.Impl;

import com.team3.dao.OrderDao;
import com.team3.entity.Book;
import com.team3.entity.Order;
import com.team3.entity.OrderStatus;
import com.team3.entity.User;
import com.team3.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao;

    @Autowired
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    //TODO: add implementation to methods
    @Override
    public void getTheMostPopularBook() {
    }

    @Override
    public void getTheMostUnpopularBook() {
    }

    @Override
    public void getHowManyBooksWereBeenReadByUser(Long id) {
    }

    @Override
    public void getHowManyBooksWereGivingInSelectedPeriod() {
    }

    @Override
    @Transactional
    public boolean reserveBook(Order order, User user, Book book) {
        if (orderDao.getCountOfRepeatedOrders(user.getId(),book.getBookId())>=1){
            return false;
        }
        else {
            order.setUser(user);
            order.setBook(book);
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            order.setReserveDate(date);
            order.setOrderStatus(OrderStatus.RESERVED);
            orderDao.addOrder(order);
            return true;
        }
    }

    @Override
    @Transactional
    public void deleteOrder(Long id) {
        orderDao.deleteOrder(id);
    }

    @Override
    @Transactional
    public Order findByOrderId(Long id) {
        return orderDao.findOrderById(id);
    }

    @Override
    @Transactional
    public List<Order> findAllOrders() {
        return orderDao.findAllOrders();
    }
}