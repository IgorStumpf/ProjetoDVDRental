package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Film;
import com.residencia.dvdrental.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Film")
public class FilmController {

	@Autowired
	private FilmService filmService;

	@GetMapping("/{id}")
	public ResponseEntity<Film> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(filmService.findById(id), headers, HttpStatus.OK);
	}
	
}