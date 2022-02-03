package com.example.order.application.business;

import java.util.Optional;

import com.example.order.application.OrderApplication;
import com.example.order.application.business.events.AddEvent;
import com.example.order.application.business.events.CancelEvent;
import com.example.order.application.business.events.UpdateEvent;
import com.example.order.application.business.exceptions.ExistingOrderException;
import com.example.order.application.business.exceptions.OrderNotExistException;
import com.example.order.domain.Order;
import com.example.order.domain.OrderId;
import com.example.order.infrastructure.OrderEventPublisher;
import com.example.order.repository.OrderRepository;

public class StandardOrderApplication implements OrderApplication {
    private OrderRepository orderRepository;
    private OrderEventPublisher eventPublisher;

    @Override
    public Order addOrder(Order order) {
        var orderId = order.getOrderId();
        if (orderRepository.existsByOrderId(orderId))
            throw new ExistingOrderException("Order already exist", orderId.getValue());
        Order addedOrder = orderRepository.addOrder(order);
        var businessEvent = new AddEvent(addedOrder);
        eventPublisher.publishEvent(businessEvent);
        return addedOrder;
    }

    @Override
    public Order updateOrder(Order order) {
        var orderId = order.getOrderId();
        if (!orderRepository.existsByOrderId(orderId))
            throw new OrderNotExistException("Order does not exist", orderId.getValue());
        Order updatedOrder = orderRepository.updateOrder(order);
        var businessEvent = new UpdateEvent(updatedOrder);
        eventPublisher.publishEvent(businessEvent);
        return updatedOrder;
    }

    @Override
    public Order cancelOrder(OrderId orderId) {
        Optional<Order> canceledOrder = orderRepository.cancelOrder(orderId);
        var order=canceledOrder.orElseThrow(()->new OrderNotExistException(
                "Order does not exist", orderId.getValue()));
        eventPublisher.publishEvent(new CancelEvent(order));
        return order;
    }

    @Override
    public Optional<Order> findOrderByOrderId(OrderId orderId) {
        return orderRepository.findOrderByOrderId(orderId);
    }
}