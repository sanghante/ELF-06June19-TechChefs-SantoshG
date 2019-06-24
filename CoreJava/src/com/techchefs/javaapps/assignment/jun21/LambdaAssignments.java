package com.techchefs.javaapps.assignment.jun21;

import java.util.function.BinaryOperator;

public class LambdaAssignments {

	public static void main(String[] args) {

		BinaryOperator<Integer> bf = (a,b) ->  a + b ;

		System.out.println(bf.apply(12, 13));
		
	}

}



