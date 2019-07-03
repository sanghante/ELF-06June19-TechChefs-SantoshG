package com.techchefs.javaapps.learning.methodreference;

import java.util.function.Function;

public class TestNonStaticMethodReference {

	public static void main(String[] args) {

		MyStudent myStudent = new MyStudent();
		
		Average a = myStudent :: calculateAvg;
		a.avg(97, 98, 99);
		
		
		myFactorial f = myStudent :: factorial;
		
		Function<Integer, Integer> func = myStudent :: factorial;
		
		System.out.println(func.apply(6));
		
		
		int res = f.fact(5);
		System.out.println(res);
		
	}

}


interface Average {
	void avg (int a, int b, int c);
}

interface myFactorial {
	int fact(int n);
}