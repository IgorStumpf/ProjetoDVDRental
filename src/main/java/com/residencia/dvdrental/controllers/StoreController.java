package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Store;
import com.residencia.dvdrental.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Store")
public class StoreController {
	@Autowired
	private StoreService storeService;

	@GetMapping("/{id}")
	public ResponseEntity<Store> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(storeService.findById(id), headers, HttpStatus.OK);
	}

}