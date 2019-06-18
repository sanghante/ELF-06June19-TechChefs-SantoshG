package com.techchefs.javaapps.learning.coupling;

public class UncleChips extends Chips {

	@Override
	void open() {
		System.out.println("Open unclechips packet");
	}
	
	void eat() {
		System.out.println("Eat unclechips");
	}
}
