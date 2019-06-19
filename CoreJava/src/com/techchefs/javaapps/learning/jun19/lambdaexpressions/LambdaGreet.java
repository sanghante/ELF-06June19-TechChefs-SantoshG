package com.techchefs.javaapps.learning.jun19.lambdaexpressions;

public class LambdaGreet {

	public static void main(String[] args) {

		Greet g = s -> "Hello "+s;
		
		System.out.println(g.greet("Santosh"));
		
	}

}
