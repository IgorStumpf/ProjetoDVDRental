package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.City;
import com.residencia.dvdrental.repositories.CityRepository;
import com.residencia.dvdrental.entities.City;
import com.residencia.dvdrental.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	public CityRepository cityRepository;

	public City findById(Integer id) {
		return cityRepository.findById(id).get();
	}

	public List<City> findAll() {
		return cityRepository.findAll();
	}

	public Long count() {
		return cityRepository.count();
	}

	public City save(City city) {
		City newCity = cityRepository.save(city);
		return newCity;
	}

}
