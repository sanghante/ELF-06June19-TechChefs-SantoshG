package com.techchefs.javaapps.learning.coupling;

public class TestBabyEat {

	public static void main(String[] args) {

		Baby b = new Baby();
		
		Lays lays = new Lays();
		UncleChips uc = new UncleChips();
		
		b.receive(lays);
		b.receive(uc);
	}

}
