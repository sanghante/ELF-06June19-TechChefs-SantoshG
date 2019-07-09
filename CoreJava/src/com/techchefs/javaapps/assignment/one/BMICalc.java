package com.techchefs.javaapps.assignment.one;

public class BMICalc {

	public static void main(String[] args) {
		
		double bmi = 0;
		double weightInKgs = 74.0;
		double heightInMts = 1.74;
		
		bmi = weightInKgs/(heightInMts * heightInMts) ;
		
		System.out.println("BMI is = "+bmi);

	}

}
