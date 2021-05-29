package com.residencia.dvdrental.entities;

import java.util.Calendar;

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
	private Calendar lastUpdate; // Modificado para Calendar (timestamp - descobrir qual o tipo)

	public Integer getFilmId() {
		return filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public Integer getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(Integer rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public Integer getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Integer rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(Integer replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}