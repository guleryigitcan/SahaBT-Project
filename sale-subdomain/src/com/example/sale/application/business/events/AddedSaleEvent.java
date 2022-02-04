package com.example.sale.application.business.events;

import com.example.sale.domain.Sale;

public class AddedSaleEvent extends SaleEvent {

	private final Sale sale;

	public AddedSaleEvent(Sale sale) {
		this.sale = sale;
	}

	public Sale getSale() {
		return sale;
	}

}
