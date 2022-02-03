package com.example.stock.infrastructure;

import com.example.stock.application.business.events.StockEvent;

public interface EventPublisher {

	void publishEvent(StockEvent businessEvent);
}
