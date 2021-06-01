package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Film_Category;
import com.residencia.dvdrental.services.Film_CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FilmCategory")
public class Film_CategoryController {
	@Autowired
	private Film_CategoryService film_CategoryService;

	@GetMapping("/{id}")
	public ResponseEntity<Film_Category> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(film_CategoryService.findById(id), headers, HttpStatus.OK);

	}

}