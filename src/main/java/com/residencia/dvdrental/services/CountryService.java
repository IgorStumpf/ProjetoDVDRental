package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Country;
import com.residencia.dvdrental.repositories.CountryRepository;
import com.residencia.dvdrental.entities.Country;
import com.residencia.dvdrental.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	public CountryRepository countryRepository;

	public Country findById(Integer id) {
		return countryRepository.findById(id).get();
	}

	public List<Country> findAll() {
		return countryRepository.findAll();
	}

	public Long count() {
		return countryRepository.count();
	}

	public Country save(Country country) {
		Country newCountry = countryRepository.save(country);
		return newCountry;
	}

}
