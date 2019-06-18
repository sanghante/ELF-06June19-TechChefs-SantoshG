package com.techchefs.javaapps.learning.constructors;

public class Ac {

	Ac(){
		System.out.println("Constructor called");
	}
	
	Ac(int x) {
		System.out.println("Int Constructor");
	}
	
	Ac(double d) {
		System.out.println("Double Constructor");
	}
	
	Ac(int a, int b) {
		System.out.println("Two int params");
	}
}
