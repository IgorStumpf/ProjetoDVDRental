package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Category;
import com.residencia.dvdrental.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Category")
public class CategoryController {

	@Autowired

	private CategoryService categoryService;

	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(categoryService.findById(id), headers, HttpStatus.OK);
	}

}