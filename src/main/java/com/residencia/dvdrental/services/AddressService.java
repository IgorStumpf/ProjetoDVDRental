package com.residencia.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Address;
import com.residencia.dvdrental.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	public AddressRepository addressRepository;

	public Address findById(Integer id) {
		return addressRepository.findById(id).get();
	}

	public List<Address> findAll() {
		return addressRepository.findAll();
	}

	public Long count() {
		return addressRepository.count();
	}

	public Address save(Address address) {
		Address newAddress = addressRepository.save(address);
		return newAddress;
	}

}
