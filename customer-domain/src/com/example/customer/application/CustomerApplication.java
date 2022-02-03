package com.example.customer.application;

import java.util.Optional;

import com.example.customer.domain.Customer;
import com.example.customer.domain.Identity;

public interface CustomerApplication {

	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer deleteCustomer(Identity identity);

	Optional<Customer> findCustomerByIdentity(Identity identity);

}
