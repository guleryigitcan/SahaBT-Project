package com.example.stock.application.business.events;

import com.example.stock.domain.Stock;

public class StockAddedEvent extends StockEvent {

	private final Stock stock;

	public StockAddedEvent(Stock stock) {
		this.stock = stock;
	}

	public Stock getStock() {
		return stock;
	}
}
