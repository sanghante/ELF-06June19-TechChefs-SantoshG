package com.techchefs.javaapps.learning.lambda.builtinfunctionalinterfaces;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {

		Predicate<Integer> testEvenOdd = a -> a % 2 == 0;
		
		System.out.println(testEvenOdd.test(33));
		System.out.println(testEvenOdd.test(32));		
		
		Predicate<String> testStringLength = a -> a.length() > 5;
		
		System.out.println(testStringLength.test("Mahadev"));		
		System.out.println(testStringLength.test("Rama"));
		
		Predicate<Integer> testGreaterThan4 = a -> a > 4;
		
		int[] a =  { 1, 2, 3, 4, 6, 7, 8, 9, 11, 10, 12};
		
		System.out.println("Printing only even numbers from this array");
		for (int i : a) {
			if(testEvenOdd.test(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println("Printing only even numbers");
		for (int i : a) {
			if (!testEvenOdd.test(i)) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("Printing numbers greater than 4");
		for (int i : a) {
			if (testGreaterThan4.test(i)) {
				System.out.println(i);
			}
		}
		
	}

}
