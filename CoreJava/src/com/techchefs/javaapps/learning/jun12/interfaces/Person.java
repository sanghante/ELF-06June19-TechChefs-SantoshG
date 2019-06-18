package com.techchefs.javaapps.learning.jun12.interfaces;

public class Person implements Animal, Human {

	public void walk() {
		System.out.println("Implementation for walk");
	}

	public void eat() {
		System.out.println("Implementation for eat");
	}

}
