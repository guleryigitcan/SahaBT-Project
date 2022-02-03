package com.example.order.domain;

import com.example.book.domain.Book;
import com.example.domain.Customer;

public class Order {

	private OrderId orderId;
	private Customer customer;
	private Book book;

	private Order(OrderId orderId, Customer customer, Book book) {
		this.orderId = orderId;
		this.customer = customer;
		this.book = book;
	}
 
	public OrderId getOrderId() {
		return orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Book getBook() {
		return book;
	}
	

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", book=" + book + "]";
	}

	public static class Builder {

		private OrderId orderId;
		private Customer customer;
		private Book book;

		public Builder orderId(String value) {
			this.orderId = OrderId.of(value);
			return this;
		}

		public Builder customer(String fullname) {
			this.customer = Customer.of(fullname);
			return this;
		}

		public Builder book(String isbn) {
			this.book = Book.of(isbn);
			return this;
		}
		
		public Order build() {
			var order = new Order(orderId, customer, book);
			return order;
		}
	}

}
