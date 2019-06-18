package com.techchefs.javaapps.learning.explore;

public class LargestOfThree {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 19; b = 14; c=21;
		
		int largest = a;
		
		if (b > a) {
			largest = b;
		} else {
			largest = a;			
		}
		
		if (c > largest) {
			largest = c;
		}
		
		System.out.println(largest);
	}
}
