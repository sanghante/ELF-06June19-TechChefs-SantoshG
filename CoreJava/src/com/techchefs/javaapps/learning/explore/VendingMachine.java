package com.techchefs.javaapps.learning.explore;

public class VendingMachine {

	public static void main(String[] args) {

		int input = 10;
		
		switch (input) {

		default : System.out.println("Invalid option, select 10, 20 or 50");
		break;

		case 10 : System.out.println("Lays");
		break;
		
		case 20 : System.out.println("Kurkure");
		break;
		
		case 50 : System.out.println("Cadbury dairy milk");
		break;
		
		}
	}

}
