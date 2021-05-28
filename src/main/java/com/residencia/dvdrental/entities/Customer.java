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
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerId")
	private Integer customerId;
	
	@Column(name = "storeId")
	private Integer storeId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "addressId")
	private Integer addressId;
	
	@Column(name = "activeBool")
	private Boolean activeBool; // verificar tipo
	
	@Column(name = "createDate")
	private Date createDate;
	
	@Column(name = "active")
	private Integer active;
	
	@Column(name = "lastUpdate")
	private String lastUpdate; // timestamp verificar tipo
	
}
