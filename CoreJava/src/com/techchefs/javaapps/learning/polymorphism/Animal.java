package com.techchefs.javaapps.learning.polymorphism;

public class Animal {

	void eat() {
		
	}
}

class Cow extends Animal {
	
	void eat() {
		System.out.println("Cow eats");
	}
}

class Lion extends Animal {
	
	void eat() {
		System.out.println("Lion eats");
	}
}

