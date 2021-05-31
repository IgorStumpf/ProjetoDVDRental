package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.Actor;
import com.residencia.dvdrental.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Actor")
public class ActorController {

	@Autowired
	private ActorService actorService;

	@GetMapping("/{id}")
    public ResponseEntity<Actor> findById(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(actorService.findById(id),headers, HttpStatus.OK);
    }
	
}