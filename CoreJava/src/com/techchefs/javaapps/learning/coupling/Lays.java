package com.techchefs.javaapps.learning.coupling;

public class Lays extends Chips {

	@Override
	void open() {
		System.out.println("open lays packet");
	}
	
	void eat() {
		System.out.println("eat lays");
	}
}
