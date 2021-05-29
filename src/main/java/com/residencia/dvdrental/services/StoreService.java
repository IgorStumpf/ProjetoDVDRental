package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Store;
import com.residencia.dvdrental.repositories.StoreRepository;

@Service
public class StoreService {

	@Autowired
	public StoreRepository storeRepository;

	public Store findById(Integer id) {
		return storeRepository.findById(id).get();
	}

	public List<Store> findAll() {
		return storeRepository.findAll();
	}

	public Long count() {
		return storeRepository.count();
	}

	public Store save(Store store) {
		Store newStore = storeRepository.save(store);
		return newStore;
	}

}
