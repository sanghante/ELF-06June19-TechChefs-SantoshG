package com.techchefs.javaapps.learning.abstraction;

public class SbiATMCard implements ATMCard {

	@Override
	public void validate() {
		System.out.println("SBI ATM Card validation complete");
	}

	@Override
	public int getInfo() {
		System.out.println("SBI Account info returned");
		return 0;
	}

}
