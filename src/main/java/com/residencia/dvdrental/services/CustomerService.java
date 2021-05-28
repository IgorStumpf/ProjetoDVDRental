package com.residencia.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Customer;
import com.residencia.dvdrental.repositories.CustomerRepository;
import com.residencia.dvdrental.entities.Customer;
import com.residencia.dvdrental.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	public CustomerRepository customerRepository;

	public Customer findById(Integer id) {
		return customerRepository.findById(id).get();
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public Long count() {
		return customerRepository.count();
	}

	public Customer save(Customer customer) {
		Customer newCustomer = customerRepository.save(customer);
		return newCustomer;
	}

}
