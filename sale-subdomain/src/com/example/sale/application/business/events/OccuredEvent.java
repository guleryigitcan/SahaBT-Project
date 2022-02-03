package com.example.sale.application.business.events;

import com.example.sale.domain.Sale;

public class OccuredEvent {

	private final Sale sale;

    public OccuredEvent(Sale sale) {
        this.sale = sale;
    }
    public Sale getSale() {
        return sale;
    }
}
