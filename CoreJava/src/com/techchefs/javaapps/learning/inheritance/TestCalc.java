package com.techchefs.javaapps.learning.inheritance;

public class TestCalc {
	
	public static void main(String[] args) {
		
		ScientificCalculator sc = new ScientificCalculator();
		sc.add();
		sc.sub();
		sc.sin();
		sc.cos();
		
		Calculator c = new Calculator();
		c.add();
		c.sub();
	}

}
