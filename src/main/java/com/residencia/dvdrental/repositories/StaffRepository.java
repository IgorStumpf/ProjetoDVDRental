package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.residencia.dvdrental.entities.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{

}
