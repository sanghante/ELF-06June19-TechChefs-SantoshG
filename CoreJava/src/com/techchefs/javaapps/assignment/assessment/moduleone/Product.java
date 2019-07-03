package com.techchefs.javaapps.assignment.assessment.moduleone;

/**
 * 
 * @author Santosh
 *
 */

public class Product {
	
	private int id;
	private String name;
	private ProductType type;
	private double cost;
	
	public Product(int id, String name, ProductType type, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.type = type;
	}
	
	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + "]";
	}
	
	

}
