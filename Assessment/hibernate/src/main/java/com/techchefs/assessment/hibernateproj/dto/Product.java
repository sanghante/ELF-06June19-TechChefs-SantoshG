package com.techchefs.assessment.hibernateproj.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	@Column(name="productId")
	int productId;
	
	@Column(name="productName")
	String productName;
	
	@Column(name="price")
	double price;
	
	@Column(name="color")
	String color;
	
	@Column(name="weight")
	double weight;

}
