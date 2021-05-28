package com.residencia.dvdrental.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Igor Stumpf
 * @date 2021-05-23
 */
@Entity
@Table(name = "Film")
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "filmId")
	private Integer filmId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "releaseYear")
	private Integer releaseYear;
	
	@Column(name = "languageId")
	private Integer languageId;
	
	@Column(name = "rentalDuration")
	private Integer rentalDuration;
	
	@Column(name = "rentalRate")
	private Integer rentalRate;
	
	@Column(name = "length")
	private Integer length;
	
	@Column(name = "replacementCost")
	private Integer replacementCost;
	
	@Column(name = "rating")
	private String rating; // mpaa verificar tipo
	
	@Column(name = "specialFeatures")
	private String specialFeatures; // text verificar tipo
	
	@Column(name = "fullText")
	private String fullText; // tsvector verificar tipo
	
	@Column(name = "lastUpdate")
	private String lastUpdate; // timestamp verificar tipo

}
