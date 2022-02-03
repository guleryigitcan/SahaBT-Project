package com.example.order.infrastructure;

import com.example.order.application.business.events.OrderEvent;

public interface OrderEventPublisher {

	 void publishEvent(OrderEvent businessEvent);
}
