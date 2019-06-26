package com.techchefs.javaapps.learning.exceptionhandling;

public class TestBooking {
	
	public static void main(String[] args) {
		
		PayTM payTM = new PayTM();
		
		System.out.println("Main: First user");
		try {
			payTM.getTicket("san", 1);
			System.out.println("Main: Congrats first user");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}		
		
		System.out.println("Main: Second user");
		try {
			payTM.getTicket(null, 1);
			System.out.println("Main: Congrats second user");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main: Third user");
		try {
			payTM.getTicket("san", 0);
			System.out.println("Main: Congrats third user");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
