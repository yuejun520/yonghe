package com.hbnu.service;

import com.hbnu.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAllOrders();

    void addOrder(Order order);

    void deleteOrder(int id);

    Order findOrderById(int id);

    void updateOrder(Order order);
}
