package com.example.publisher.infrastructure;

public interface PublisherEventPublisher<Event> {

	void publishEvent(Event event);	
}
