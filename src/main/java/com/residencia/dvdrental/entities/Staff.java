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
@Table(name = "staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staffId")
	private Integer staffId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "addressId")
	private Integer addressId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "storeId")
	private Integer storeId;
	
	@Column(name = "active")
	private Boolean active;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "picture")
	private String picture; // timestamp verificar tipo
	
	@Column(name = "lastUpdate")
	private String lastUpdate; // timestamp verificar tipo

}
