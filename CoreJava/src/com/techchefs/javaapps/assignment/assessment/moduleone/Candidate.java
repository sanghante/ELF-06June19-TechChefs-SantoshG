package com.techchefs.javaapps.assignment.assessment.moduleone;

public class Candidate {

	private String name;
	private Gender gender;
	private double percentage;
	
	public Candidate(String name, Gender gender, double percentage) {
		super();
		this.name = name;
		this.gender = gender;
		this.percentage = percentage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
}
