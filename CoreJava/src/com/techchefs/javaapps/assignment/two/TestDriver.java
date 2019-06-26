package com.techchefs.javaapps.assignment.two;

public class TestDriver {

	public static void main(String[] args) {

		Driver driver = new Driver();
		Car car = new Audi(90);
		driver.receive(car);
		driver.drive();
		
	}

}
