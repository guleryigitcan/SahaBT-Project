package com.example.customer.application.business.events;

import com.example.customer.domain.Customer;

public class CustomerDeletedEvent extends CustomerEvent {

	private final Customer customer;

	public CustomerDeletedEvent(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

}
