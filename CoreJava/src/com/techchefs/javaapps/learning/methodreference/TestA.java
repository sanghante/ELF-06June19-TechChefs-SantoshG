package com.techchefs.javaapps.learning.methodreference;

public class TestA {

	public static void main(String[] args) {

		Arithmetic arithmetic = TestADemo :: sumDemo;
		int res = arithmetic.add(6, 9);
		System.out.println(res);
		
		arithmetic = TestA :: sum;
		res = arithmetic.add(6, 9);
		System.out.println(res);
	}
	
	static int sum(int a, int b) {
		return a + b;
	}
}

interface Arithmetic {
	int add(int a, int b);
}