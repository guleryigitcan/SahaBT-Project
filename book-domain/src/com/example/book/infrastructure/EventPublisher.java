package com.example.book.infrastructure;

import com.example.book.application.business.events.BookEvent;

public interface EventPublisher {

	void publishEvent(BookEvent businessEvent);

}
