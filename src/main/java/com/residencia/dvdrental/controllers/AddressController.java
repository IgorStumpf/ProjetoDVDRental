package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Address;
import com.residencia.dvdrental.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Address")
public class AddressController {

	@Autowired

	private AddressService addressService;

	@GetMapping("/{id}")
	public ResponseEntity<Address> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(addressService.findById(id), headers, HttpStatus.OK);
	}

}