package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Actor;
import com.residencia.dvdrental.repositories.ActorRepository;
import com.residencia.dvdrental.entities.Actor;
import com.residencia.dvdrental.repositories.ActorRepository;

@Service
public class ActorService {

	@Autowired
	public ActorRepository actorRepository;

	public Actor findById(Integer id) {
		return actorRepository.findById(id).get();
	}

	public List<Actor> findAll() {
		return actorRepository.findAll();
	}

	public Long count() {
		return actorRepository.count();
	}

	public Actor save(Actor actor) {
		Actor newActor = actorRepository.save(actor);
		return newActor;
	}

}
