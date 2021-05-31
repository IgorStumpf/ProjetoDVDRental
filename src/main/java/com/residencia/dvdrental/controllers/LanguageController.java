package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Language;
import com.residencia.dvdrental.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Language")

public class LanguageController {
	@Autowired
	private LanguageService languageService;

	@GetMapping("/{id}")
	public ResponseEntity<Language> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(languageService.findById(id), headers, HttpStatus.OK);
	}
	
}