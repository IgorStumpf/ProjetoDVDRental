package com.residencia.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Category;
import com.residencia.dvdrental.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	public CategoryRepository categoryRepository;

	public Category findById(Integer id) {
		return categoryRepository.findById(id).get();
	}

	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	public Long count() {
		return categoryRepository.count();
	}

	public Category save(Category category) {
		Category newCategory = categoryRepository.save(category);
		return newCategory;
	}

}
