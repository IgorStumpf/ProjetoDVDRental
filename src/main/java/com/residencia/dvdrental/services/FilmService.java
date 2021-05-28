package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Film;
import com.residencia.dvdrental.repositories.FilmRepository;
import com.residencia.dvdrental.entities.Film;
import com.residencia.dvdrental.repositories.FilmRepository;

@Service
public class FilmService {

	@Autowired
	public FilmRepository filmRepository;

	public Film findById(Integer id) {
		return filmRepository.findById(id).get();
	}

	public List<Film> findAll() {
		return filmRepository.findAll();
	}

	public Long count() {
		return filmRepository.count();
	}

	public Film save(Film film) {
		Film newFilm = filmRepository.save(film);
		return newFilm;
	}

}
