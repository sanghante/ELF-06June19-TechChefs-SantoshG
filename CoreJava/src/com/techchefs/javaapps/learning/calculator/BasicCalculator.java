package com.techchefs.javaapps.learning.calculator;

public class BasicCalculator implements Calculator {
	
	@Override
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}
	
	
	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	
	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	
	@Override
	public int divide(int num1, int num2) {
		return num1/num2;
	}
}
