package com.techchefs.javaapps.assignment.jun21;

import java.util.function.BiConsumer;

public class LambdaNumbersInRange {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> printRange = (first, last) -> {
			for (int i = first; i <= last; i++) {

				System.out.print(i);
				System.out.print(" ");
			}
		};

		printRange.accept(30, 45);

	}

}
