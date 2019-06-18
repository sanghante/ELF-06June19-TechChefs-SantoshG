package com.techchefs.javaapps.learning.explore;

public class OddOrEven {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Please pass a number as argument to the program");
		}
		
		if (args.length >= 1) {
			int value = Integer.valueOf(args[0]);
			if (value%2 == 0) {
				System.out.println("Even number");
			} else {
				System.out.println("Odd number");
			}
		}

	}

}
