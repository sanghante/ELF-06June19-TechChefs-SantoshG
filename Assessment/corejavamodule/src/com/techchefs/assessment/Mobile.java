package com.techchefs.assessment;

/**
 * 
 * @author Santosh
 *
 */

public class Mobile {
	
	private String brandName;
	private double cost;
	private String modelName;
	
	public Mobile(String brandName, double cost, String modelName) {
		this.brandName = brandName;
		this.cost = cost;
		this.modelName = modelName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Mobile [brandName=" + brandName + ", cost=" + cost + ", modelName=" + modelName + "]";
	}
	

}
