package com.techchefs.javaapps.learning.staticvariables;

public class TestCard {

	public static void main(String[] args) {

		Card j = new Card();
		Card a = new Card();
				
		j.swipe();
		a.swipe();
		a.swipe();
		
		System.out.println("Java card count is : "+j.count);
		System.out.println("Angular card count is : "+a.count);
		
		System.out.println("Organization count is : "+Card.orgCount);
	}

}
