package com.example.order.application.business.exceptions;

public class OrderNotExistException extends RuntimeException {
    private final String orderID;

    public OrderNotExistException(String message, String orderID) {
        super(message);
        this.orderID=orderID;
    }

    public String getOrderID() {
        return orderID;
    }
}
