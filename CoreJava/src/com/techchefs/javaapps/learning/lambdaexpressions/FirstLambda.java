package com.techchefs.javaapps.learning.lambdaexpressions;

public class FirstLambda {

	public static void main(String[] args) {
		
		Sum s = (a,b) -> a+b;
		
		int i = s.add(7, 9);
		System.out.println(i);
	}
	
}

interface Sum {
	int add(int a, int b);
}
