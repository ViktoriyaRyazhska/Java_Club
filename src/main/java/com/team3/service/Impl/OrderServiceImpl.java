package com.team3.service.Impl;

import com.team3.dao.OrderDao;
import com.team3.entity.Order;
import com.team3.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao;
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
    public void addOrder(Order order) {
        orderDao.addOrder(order);
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