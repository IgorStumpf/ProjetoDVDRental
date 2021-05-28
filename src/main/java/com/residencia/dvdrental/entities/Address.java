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
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addressId")
	private Integer addressId;

	@Column(name = "address")
	private String address;

	@Column(name = "address2")
	private String address2;

	@Column(name = "district")
	private String district;

	@Column(name = "cityId")
	private Integer cityId;

	@Column(name = "postalCode")
	private String postalCode;

	@Column(name = "phone")
	private String phone;

	@Column(name = "lastUpdate")
	private String lastUpdate; // timestamp verificar tipo

}
