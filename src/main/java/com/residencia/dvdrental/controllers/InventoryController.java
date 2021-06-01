package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Inventory;
import com.residencia.dvdrental.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Inventory")
public class InventoryController {
	@Autowired
	private InventoryService inventoryService;

	@GetMapping("/{id}")
	public ResponseEntity<Inventory> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(inventoryService.findById(id), headers, HttpStatus.OK);
	}
	
}