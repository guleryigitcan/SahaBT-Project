package com.example.customer.repository;

import java.util.Optional;

import com.example.customer.domain.Customer;
import com.example.customer.domain.Identity;

public interface CustomerRepository {

	boolean existsByIdentity(Identity identity);

	Customer add(Customer customer);

	Customer update(Customer customer);

	Optional<Customer> delete(Identity identity);

	Optional<Customer> findCustomerById(Identity identity);

}
