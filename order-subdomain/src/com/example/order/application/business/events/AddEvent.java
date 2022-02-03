package com.example.order.application.business.events;

import com.example.order.domain.Order;

public class AddEvent extends OrderEvent{

	private final Order order;

    public AddEvent(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
