package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.residencia.dvdrental.entities.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer>{

}
