package com.residencia.dvdrental.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.dvdrental.entities.Staff;
import com.residencia.dvdrental.repositories.StaffRepository;
import com.residencia.dvdrental.entities.Staff;
import com.residencia.dvdrental.repositories.StaffRepository;

@Service
public class StaffService {

	@Autowired
	public StaffRepository staffRepository;

	public Staff findById(Integer id) {
		return staffRepository.findById(id).get();
	}

	public List<Staff> findAll() {
		return staffRepository.findAll();
	}

	public Long count() {
		return staffRepository.count();
	}

	public Staff save(Staff staff) {
		Staff newStaff = staffRepository.save(staff);
		return newStaff;
	}

}
