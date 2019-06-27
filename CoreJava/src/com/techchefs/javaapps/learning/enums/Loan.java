package com.techchefs.javaapps.learning.enums;

public enum Loan {
	
	HOME(100), PERSONAL(101), CAR(102);
	
	private int value;	
	
	private Loan(int value) {
		this.value = value;
	}
	
	int getValue() {
		return value;
	}

}
