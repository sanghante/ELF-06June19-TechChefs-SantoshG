package com.techchefs.javaapps.assignment.one;

public class OddDivisibleBy7 {

	void main() {
		for (int i=1; i<=100; i++ ) {
			if(i %2 == 1) {
				if (i % 7 ==0) {
					System.out.println(i);
				}
			}
		}
	}
}

