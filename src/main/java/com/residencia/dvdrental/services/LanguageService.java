package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Language;
import com.residencia.dvdrental.repositories.LanguageRepository;
import com.residencia.dvdrental.entities.Language;
import com.residencia.dvdrental.repositories.LanguageRepository;

@Service
public class LanguageService {

	@Autowired
	public LanguageRepository languageRepository;

	public Language findById(Integer id) {
		return languageRepository.findById(id).get();
	}

	public List<Language> findAll() {
		return languageRepository.findAll();
	}

	public Long count() {
		return languageRepository.count();
	}

	public Language save(Language language) {
		Language newLanguage = languageRepository.save(language);
		return newLanguage;
	}

}
