package com.example.requistion.infrastructure;

import com.example.requistion.application.business.events.RequistionEvent;

public interface EventPublisher {

	void publishEvent(RequistionEvent businessEvent);
}
