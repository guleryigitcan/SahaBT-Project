package com.example.stock.application.business;

@SuppressWarnings("serial")
public class StockNotFoundException extends RuntimeException {

	private final String sku;

	public StockNotFoundException(String message, String sku) {
		super(message);
		this.sku = sku;
	}

	public String getSku() {
		return sku;
	}

}
