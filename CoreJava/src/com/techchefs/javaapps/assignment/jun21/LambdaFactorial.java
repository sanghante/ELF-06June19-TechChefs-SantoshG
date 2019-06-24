package com.techchefs.javaapps.assignment.jun21;

import java.util.function.IntFunction;

public class LambdaFactorial {

	public static void main(String[] args) {

		IntFunction factFunction = a -> {
			int k = 1;

			for (int i = 1; i <= a; i++) {
				k = k * i;
			}
			return k;
		};

		System.out.println(factFunction.apply(7));

	}

}
