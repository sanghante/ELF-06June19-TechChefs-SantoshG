package com.techchefs.javaapps.learning.jun14.exceptionhandling;

public class PayTM {

	void getTicket(String details, int num) throws Exception {
		
		IRCTC irctc = new IRCTC();
		
		System.out.println("PayTM: Attempting to get ticket from IRCTC");
		
		try {
		
			irctc.book(details, num);
			System.out.println("PayTM: Booking successful, received ticket");
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
			System.out.println("PayTM: Could not book ticket, try again later");
			throw exception;
		}
	}
}
