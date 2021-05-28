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
@Table(name = "city")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cityId")
	private Integer cityId;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "countryId")
	private Integer countryId;
	
	@Column(name = "lastUpdate")
	private String lastUpdate; // timestamp verificar tipo

}
