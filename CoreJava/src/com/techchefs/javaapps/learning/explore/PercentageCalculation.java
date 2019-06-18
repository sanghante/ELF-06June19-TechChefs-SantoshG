package com.techchefs.javaapps.learning.explore;

public class PercentageCalculation {
	
	static double percentage(double obtained, double total) {
		return obtained/total*100;
	}
	
	public static void main(String[] args) {
		
		System.out.println(percentage(650,875));

	}

}
