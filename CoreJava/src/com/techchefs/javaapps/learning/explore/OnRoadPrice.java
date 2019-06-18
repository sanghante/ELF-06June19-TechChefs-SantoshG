package com.techchefs.javaapps.learning.explore;

public class OnRoadPrice {

	public static void main(String[] args) {
		
		double exShowRoomPrice = 570000;
		
		double rtoRate = 14.26;
		
		double insuranceRate = 9.76;
		
		double rtoCharge =  (exShowRoomPrice * rtoRate)/100;
		
		double insuranceCharge = (exShowRoomPrice * insuranceRate)/100;
		
		double onRoadPrice = exShowRoomPrice+rtoCharge+insuranceCharge;
		
		System.out.println("Ex-showroom cost of car ="+exShowRoomPrice);
		System.out.println("Rto Charge = "+rtoCharge);
		System.out.println("Insurance cost = "+insuranceCharge);
		System.out.println("On road price of car = "+onRoadPrice);

	}

}
