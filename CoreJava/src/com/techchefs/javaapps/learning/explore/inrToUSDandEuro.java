package com.techchefs.javaapps.learning.explore;

public class inrToUSDandEuro {

	public static void main(String[] args) {
		
		double amount = 1000;
		
		double inrUSD, inrEuro, USD, Euro;
		
		USD = 69.55;
		
		Euro =  78.60;
		
		inrUSD = amount/USD;
		inrEuro = amount/Euro;
		
		System.out.println("1000 rupees = "+inrUSD+" $");
		System.out.println("1000 rupees = "+inrEuro+" Euro");
				

	}

}
