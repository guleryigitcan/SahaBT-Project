package com.example.order.application.business.events;

import com.example.order.domain.Order;

public class UpdateEvent extends OrderEvent {

	 private final Order order;

	    public UpdateEvent(Order order) {
	        this.order = order;
	    }

	    public Order getOrder() {
	        return order;
	    }
}
