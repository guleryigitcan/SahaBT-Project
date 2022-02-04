package com.example.customer.application.business.events;

import com.example.customer.domain.Customer;

public class CustomerUpdatedEvent extends CustomerEvent {

	private final Customer customer;

	public CustomerUpdatedEvent(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

}
