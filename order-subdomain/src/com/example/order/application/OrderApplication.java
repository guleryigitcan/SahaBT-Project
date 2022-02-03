package com.example.order.application;

import java.util.Optional;

import com.example.order.domain.Order;
import com.example.order.domain.OrderId;

public interface OrderApplication {
    Order addOrder(Order order);
    Order updateOrder(Order order);
    Order cancelOrder(OrderId orderId);
    Optional<Order> findOrderByOrderId(OrderId orderId);
}
