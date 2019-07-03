package com.techchefs.javaapps.assignment.assessment.moduleone;
public class HdfcATMCard implements ATMCard {

	public void validate() {
		System.out.println("HDFC ATM card validation complete");
	}

	public int getInfo() {
		System.out.println("HDFC Account info returned");
		return 0;
	}
	
}