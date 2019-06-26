package com.techchefs.javaapps.learning.methodreference;

public class MyStudent {
	
	MyStudent() {
	
	}
	
	void calculateAvg (int a, int b, int c) {
		double avg = (a + b + c) / 3.0 ;
		System.out.println("Average is "+avg);
	}
	
	
	int factorial (int n) {
		int f = n;
		while (n > 1) {
			f = --n * f;
		}
		return f;
	}
}