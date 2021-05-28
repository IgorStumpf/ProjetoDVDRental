package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Inventory;
import com.residencia.dvdrental.repositories.InventoryRepository;
import com.residencia.dvdrental.entities.Inventory;
import com.residencia.dvdrental.repositories.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	public InventoryRepository inventoryRepository;

	public Inventory findById(Integer id) {
		return inventoryRepository.findById(id).get();
	}

	public List<Inventory> findAll() {
		return inventoryRepository.findAll();
	}

	public Long count() {
		return inventoryRepository.count();
	}

	public Inventory save(Inventory inventory) {
		Inventory newInventory = inventoryRepository.save(inventory);
		return newInventory;
	}

}
