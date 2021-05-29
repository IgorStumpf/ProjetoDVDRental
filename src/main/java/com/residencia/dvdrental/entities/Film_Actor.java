package com.residencia.dvdrental.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "film_actor")
public class Film_Actor {

	@Id
	@OneToOne
	@Column(name = "actor_id")
	private Actor actorId;

	@Id
	@OneToOne
	@JoinColumn(name = "film_id")
	private Film filmId;

	@Column(name = "last_update")
	private Calendar lastUpdate;

	public Actor getActorId() {
		return actorId;
	}

	public void setActorId(Actor actorId) {
		this.actorId = actorId;
	}

	public Film getFilmId() {
		return filmId;
	}

	public void setFilmId(Film filmId) {
		this.filmId = filmId;
	}

	public Calendar getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Calendar lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}