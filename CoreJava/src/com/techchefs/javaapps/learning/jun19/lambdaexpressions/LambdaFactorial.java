package com.techchefs.javaapps.learning.jun19.lambdaexpressions;

public class LambdaFactorial {

	public static void main(String[] args) {
		
		Factorial f = a -> {
			int k=1;
			for( int i = 1; i <= a; i++) {
				k = k * i;
			}
			return k;
		};
		
	int res = f.fact(6);
	
	System.out.println(res);
	}
}

interface Factorial {
	int fact(int a);
}