package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Film_Actor;
import com.residencia.dvdrental.services.Film_ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FilmActor")
public class Film_ActorController {
	@Autowired
	private Film_ActorService film_ActorService;

	@GetMapping("/{id}")
	public ResponseEntity<Film_Actor> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(film_ActorService.findById(id), headers, HttpStatus.OK);
	}
	
}