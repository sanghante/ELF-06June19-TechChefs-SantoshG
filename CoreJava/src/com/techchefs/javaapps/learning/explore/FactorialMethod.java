package com.techchefs.javaapps.learning.explore;

public class FactorialMethod {
	
	static int factorial(int a) {
		int n=1;
		
		for (int i=1; i<=a; i++) {
		
			n = n * i;
	
		}
		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}

}
