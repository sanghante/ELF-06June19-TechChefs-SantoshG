package com.techchefs.javaapps.learning.jun10.polymorphism;

public class TestA {
	
	static Animal a;

	public static void main(String[] args) {
		
		a = new Lion();
		
		a.eat();
		
	}
}
