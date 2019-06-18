package com.techchefs.javaapps.learning.jun12.abstraction;

public class IciciATMCard implements ATMCard {

	public void validate() {
		System.out.println("Icici ATM Card validation complete");
	}

	public int getInfo() {
		System.out.println("Icici Account info returned");
		return 0;
	}

}
