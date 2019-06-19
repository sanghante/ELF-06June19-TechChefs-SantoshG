package com.techchefs.javaapps.learning.jun19.lambdaexpressions;

public class LambdaSquareofnum {

	public static void main(String[] args) {
		
		Square s = b -> b * b;
		
		System.out.println(s.numSquare(2.3));
	}
}

interface Square {
	double numSquare(double a);
}
