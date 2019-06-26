package com.techchefs.javaapps.learning.lambdaexpressions;

public class LambdaStringLength {

	public static void main(String[] args) {
		
		SLength s = a -> a.length();
		
		System.out.println(s.sLength("santosh"));
		
	}
}


interface SLength {
	
	int sLength(String s);
}