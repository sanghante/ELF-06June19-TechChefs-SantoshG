package com.techchefs.javaapps.learning.coupling;

public class TestPersonBottle {

	public static void main(String[] args) {
		Person person = new Person();
		Bottle bottle = new Bottle();
		
		person.receive(bottle);
	}
	
}
