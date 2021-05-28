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
@Table(name = "payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paymentId")
	private Integer paymentId;
	
	@Column(name = "customerId")
	private Integer customerId;
	
	@Column(name = "staffId")
	private Integer staffId;
	
	@Column(name = "rentalId")
	private Integer rentalId;
	
	@Column(name = "amount")
	private Integer amount;
	
	@Column(name = "lastUpdate")
	private String lastUpdate; // timestamp verificar tipo

}
