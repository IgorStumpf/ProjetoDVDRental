package com.residencia.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Film_Actor;
import com.residencia.dvdrental.repositories.Film_ActorRepository;

@Service
public class Film_ActorService {

	@Autowired
	public Film_ActorRepository film_actorRepository;

	public Film_Actor findById(Integer id) {
		return film_actorRepository.findById(id).get();
	}

	public List<Film_Actor> findAll() {
		return film_actorRepository.findAll();

	}

	public Long count() {
		return film_actorRepository.count();
	}

	public Film_Actor save(Film_Actor film_actor) {
		Film_Actor newFilm_Actor = film_actorRepository.save(film_actor);
		return newFilm_Actor;
	}
}