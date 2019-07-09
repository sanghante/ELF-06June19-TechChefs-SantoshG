package com.techchefs.javaapps.assignment.one;

public class CalcBMI {

	public double assessBMI(double height, double weight) {
		
		return weight/(height*height);
	}
	
	public void result(double bmi) {
		
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
		
		CalcBMI calcBMI = new CalcBMI();
		
		double r = calcBMI.assessBMI(1.74, 74);
		System.out.println("BMI is : "+r);
		calcBMI.result(r);

	}

}
