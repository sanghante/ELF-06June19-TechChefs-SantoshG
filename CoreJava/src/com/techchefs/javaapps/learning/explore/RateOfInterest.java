package com.techchefs.javaapps.learning.explore;

public class RateOfInterest {

	public static void main(String[] args) {

		int principal = 100000, time = 2; 
		double rate = 14.92;
		
		double interest = (principal * rate * time) / 100;
		
		System.out.println("Interest ="+interest);
	}

}
