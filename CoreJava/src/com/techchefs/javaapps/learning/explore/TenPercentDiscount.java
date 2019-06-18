package com.techchefs.javaapps.learning.explore;

public class TenPercentDiscount {

	public static void main(String[] args) {
		
		int login = 0;
		if (args.length > 0) {
		 login = Integer.valueOf(args[0]);
		}
		double costPrice = 1500;
		double discount = 0;
		double sellingPrice;
		
		if (login == 0) {
			discount = 15.4;
		}
		
		sellingPrice = costPrice - costPrice*discount/100;
		
		System.out.println("Pay : "+sellingPrice);
		System.out.println("Discount % : "+discount);
		System.out.println("Discounted amount : "+(costPrice - sellingPrice));

	}

}
