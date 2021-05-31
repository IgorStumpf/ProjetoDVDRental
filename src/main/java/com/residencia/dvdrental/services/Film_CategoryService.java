package com.residencia.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Film_Category;
import com.residencia.dvdrental.repositories.Film_CategoryRepository;

@Service
public class Film_CategoryService {

	@Autowired
	public Film_CategoryRepository film_categoryRepository;

	public Film_Category findById(Integer id) {
		return film_categoryRepository.findById(id).get();
	}

	public List<Film_Category> findAll() {
		return film_categoryRepository.findAll();
	}

	public Long count() {
		return film_categoryRepository.count();
	}

	public Film_Category save(Film_Category film_category) {
		Film_Category newFilm_Category = film_categoryRepository.save(film_category);
		return newFilm_Category;
	}

}