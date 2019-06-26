package com.techchefs.javaapps.learning.lambda.builtinfunctionalinterfaces;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		
		Function<Double, Double> functionT = r -> 3.1415 * r * r;
		
		System.out.println(functionT.apply(4.0));
		
		Function<String, Integer> strLength = s -> s.length();
		
		System.out.println(strLength.apply("Santosh"));		
		
		Function<Double, Double> squareNumber = a -> a * a;
		
		System.out.println(squareNumber.apply(6.0));
		
	}

}
