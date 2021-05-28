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
@Table(name = "store")
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "storeId")
	private Integer storeId;
	
	@Column(name = "managerStaffId")
	private Integer managerStaffId;
	
	@Column(name = "addressId")
	private Integer addressId;
	
	@Column(name = "lastUpdate")
	private String lastUpdate; // timestamp verificar tipo

}
