package com.techchefs.javaapps.assignment.five;

import java.util.function.IntFunction;

public class LambdaSquareOfANumber {

	public static void main(String[] args) {

		IntFunction square = a -> a * a;
		
		System.out.println(square.apply(20));
	}

}
