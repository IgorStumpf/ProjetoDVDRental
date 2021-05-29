package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.residencia.dvdrental.entities.Film_Actor;
import com.residencia.dvdrental.entities.Film_Category;

@Repository
public interface Film_CategoryRepository extends JpaRepository<Film_Category, Integer> {

}
