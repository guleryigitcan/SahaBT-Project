package com.example.requistion.infrastructure;

public interface EventPublisher<Event> {
	
	void publishEvent(Event event);

}
