package com.example.sale.application.business.events;

import com.example.sale.domain.Sale;

public class CancelEvent {

	private final Sale sale;

    public CancelEvent(Sale sale) {
        this.sale = sale;
    }

    public Sale getSale() {
        return sale;
    }
}
