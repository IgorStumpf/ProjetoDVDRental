package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.City;
import com.residencia.dvdrental.services.CityService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("City")
public class CityController {

	private CityService cityService;

	@GetMapping("/{id}")
	public ResponseEntity<City> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(cityService.findById(id), headers, HttpStatus.OK);
	}

}