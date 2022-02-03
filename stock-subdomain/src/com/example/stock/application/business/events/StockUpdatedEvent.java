package com.example.stock.application.business.events;

import com.example.stock.domain.Stock;

public class StockUpdatedEvent extends StockEvent {

	private final Stock stock;

	public StockUpdatedEvent(Stock stock) {
		this.stock = stock;
	}

	public Stock getStock() {
		return stock;
	}

}
