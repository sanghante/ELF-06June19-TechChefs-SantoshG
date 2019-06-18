package com.techchefs.javaapps.assignment.jun11;

public class TestDriver {

	public static void main(String[] args) {

		Driver driver = new Driver();
		Car car = new Audi(90);
		driver.receive(car);
		driver.drive();
		
	}

}
