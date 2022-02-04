package com.example.customer.infrastructure;

import com.example.customer.application.business.events.CustomerEvent;

public interface EventPublisher {

	void publishEvent(CustomerEvent businessEvent);

}
