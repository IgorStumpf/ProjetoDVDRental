package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Payment;
import com.residencia.dvdrental.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@GetMapping("/{id}")
	public ResponseEntity<Payment> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(paymentService.findById(id), headers, HttpStatus.OK);
	}
	
}