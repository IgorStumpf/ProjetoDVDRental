package com.residencia.dvdrental.entities;

import java.util.Date;

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
@Table(name = "rental")
public class Rental {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rentalId")
	private Integer rentalId;
	
	@Column(name = "rentalDate")
	private Date rentalDate;
	
	@Column(name = "inventoryId")
	private Integer inventoryId;
	
	@Column(name = "customerId")
	private Integer customerId;
	
	@Column(name = "returnDate")
	private Date returnDate;
	
	@Column(name = "staffId")
	private Integer staffId;
	
	@Column(name = "lastUpdate")
	private String lastUpdate; // timestamp verificar tipo

}
