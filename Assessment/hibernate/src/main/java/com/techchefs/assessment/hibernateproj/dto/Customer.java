package com.techchefs.assessment.hibernateproj.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "firstName")
	String firstName;
	@Column(name = "lastName")
	String lastName;
	@Column(name = "contactNumber")
	long contactNumber;
	@Column(name = "address")
	String address;
	@Column(name = "city")
	String city;
	@Column(name = "state")
	String state;
	@Column(name = "country")
	String country;
	
}
