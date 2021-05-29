package com.residencia.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Igor Stumpf
 * @date 2021-05-23
 */
@Entity
@Table(name = "language")
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "languageId")
	private Integer languageId;

	@OneToMany(mappedBy = "languageId")
	private List<Film> filmlist;

	@Column(name = "name")
	private String name;

	@Column(name = "lastUpdate")
	private Calendar lastUpdate; // Modificado para Calendar (timestamp - descobrir qual o tipo)

	public List<Film> getFilmlist() {
		return filmlist;
	}

	public void setFilmlist(List<Film> filmlist) {
		this.filmlist = filmlist;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}