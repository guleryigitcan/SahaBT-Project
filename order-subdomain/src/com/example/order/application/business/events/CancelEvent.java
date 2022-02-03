package com.example.order.application.business.events;

import com.example.order.domain.Order;

public class CancelEvent extends OrderEvent{

	private final Order order;

    public CancelEvent(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
