package com.techchefs.javaapps.learning.enums;

public class TestExceptions {

	public static void main(String[] args) {
		
		
		try {
			
		} catch (ArithmeticException | NullPointerException ae) {
			System.out.println(ae.getMessage());
		} catch (Exception e) {
			System.out.println("General exception block");
		}
		
		
	}
}
