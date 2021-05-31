package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Rental;
import com.residencia.dvdrental.repositories.RentalRepository;

@Service
public class RentalService {

	@Autowired
	public RentalRepository rentalRepository;

	public Rental findById(Integer id) {
		return rentalRepository.findById(id).get();
	}

	public List<Rental> findAll() {
		return rentalRepository.findAll();
	}

	public Long count() {
		return rentalRepository.count();
	}

	public Rental save(Rental rental) {
		Rental newRental = rentalRepository.save(rental);
		return newRental;
	}

}
