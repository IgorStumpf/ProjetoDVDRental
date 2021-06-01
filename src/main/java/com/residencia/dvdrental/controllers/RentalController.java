package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Rental;
import com.residencia.dvdrental.services.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rental")
public class RentalController {
	@Autowired
	private RentalService rentalService;

	@GetMapping("/{id}")
	public ResponseEntity<Rental> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(rentalService.findById(id), headers, HttpStatus.OK);
	}

}