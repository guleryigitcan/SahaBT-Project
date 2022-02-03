package com.example.order.application.business.exceptions;

public class ExistingOrderException extends RuntimeException{

	private final String orderID;

    public ExistingOrderException(String message, String orderID) {
        super(message);
        this.orderID=orderID;
    }

    public String getOrderID() {
        return orderID;
    }
}
