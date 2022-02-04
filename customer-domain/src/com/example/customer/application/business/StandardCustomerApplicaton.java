package com.example.customer.application.business;

import java.util.Optional;

import com.example.customer.application.CustomerApplication;
import com.example.customer.application.business.events.CustomerAddedEvent;
import com.example.customer.application.business.events.CustomerDeletedEvent;
import com.example.customer.application.business.events.CustomerUpdatedEvent;
import com.example.customer.application.business.exception.CustomerNotFoundException;
import com.example.customer.application.business.exception.ExistingCustomerException;
import com.example.customer.domain.Customer;
import com.example.customer.domain.Identity;
import com.example.customer.infrastructure.EventPublisher;
import com.example.customer.repository.CustomerRepository;

public class StandardCustomerApplicaton implements CustomerApplication {

	private CustomerRepository customerRepository;
	private EventPublisher eventPublisher;

	public StandardCustomerApplicaton(CustomerRepository customerRepository, EventPublisher eventPublisher) {
		this.customerRepository = customerRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		var customerIdentity = customer.getIdentity();
		if (customerRepository.existsByIdentity(customerIdentity))
			throw new ExistingCustomerException("Customer already exist", customerIdentity.getIdentity());
		Customer addedCustomer = customerRepository.add(customer);
		var businessEvent = new CustomerAddedEvent(addedCustomer);
		eventPublisher.publishEvent(businessEvent);
		return addedCustomer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		var customerIdentity = customer.getIdentity();
		if (!customerRepository.existsByIdentity(customerIdentity))
			throw new CustomerNotFoundException("Customer does not exist!", customerIdentity.getIdentity());
		Customer updatedCustomer = customerRepository.update(customer);
		var businessEvent = new CustomerUpdatedEvent(updatedCustomer);
		eventPublisher.publishEvent(businessEvent);
		return updatedCustomer;
	}

	@Override
	public Customer deleteCustomer(Identity identity) {
		Optional<Customer> deletedCustomer = customerRepository.delete(identity);
		var customer = deletedCustomer
				.orElseThrow(() -> new CustomerNotFoundException("Customer does not exist!", identity.getIdentity()));
		eventPublisher.publishEvent(new CustomerDeletedEvent(customer));
		return customer;
	}

	@Override
	public Optional<Customer> findCustomerByIdentity(Identity identity) {
		return customerRepository.findCustomerById(identity);
	}

}
