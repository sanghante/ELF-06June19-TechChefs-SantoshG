package com.techchefs.javaapps.assignment.two;

public class Driver {
	
	Car car;
	void receive(Car car) {
		this.car = car;
		System.out.println("Received Car");
		if (car instanceof Audi) {
			System.out.println("Its an Audi");
		} else if (car instanceof Benz) {
			System.out.println("Its a Benz");
		}
	}
	
	void drive() {
		System.out.println("Driving car "+this.car.getClass().getCanonicalName());
	}

}
