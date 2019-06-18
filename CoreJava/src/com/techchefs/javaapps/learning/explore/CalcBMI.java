package com.techchefs.javaapps.learning.explore;

public class CalcBMI {

	static double BMI(double height, double weight) {
		
		return weight/(height*height);
	}
	
	static void result(double bmi) {
		
		if (bmi > 30.0) {
			
			System.out.println("Obese");
			
		} else if (bmi >= 25.0) {
			
			System.out.println("Overweight");
			
		} else if (bmi >= 18.5) {
			
			System.out.println("Normal");
			
		} else {
			
			System.out.println("Underweight");
			
		}
	}
	public static void main(String[] args) {
		
		double r = BMI(1.74, 74);
		System.out.println("BMI is : "+r);
		result(r);

	}

}
