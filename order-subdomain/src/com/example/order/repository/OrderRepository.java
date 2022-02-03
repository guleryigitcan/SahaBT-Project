package com.example.order.repository;

import java.util.Optional;

import com.example.order.domain.Order;
import com.example.order.domain.OrderId;

public interface OrderRepository {

	boolean existsByOrderId(OrderId orderId);

    Order addOrder(Order order);

    Order updateOrder(Order order);

    Optional<Order> cancelOrder(OrderId orderId);

    Optional<Order> findOrderByOrderId(OrderId orderId);
}
