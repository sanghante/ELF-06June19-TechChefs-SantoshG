package com.techchefs.javaapps.learning.lambda.builtinfunctionalinterfaces;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		
		GetGun factory = () -> new Gun(100);
		
		System.out.println("Create new Gun object using custom interface + lambda");
		
		System.out.println(factory.get().bullets);
		
		System.out.println("Creating new Gun object using Java Supplier interface + lambda");
		
		Supplier<Gun> gunFactory = () -> new Gun(100);
		
		System.out.println(gunFactory.get().bullets);
		
		System.out.println("Create car object using Java Supplier interface + lambda");
		
		Supplier<Car> carFactory = () -> new Car(15.6);
		
		System.out.println(carFactory.get().fuel);
	}

}

class Gun {
	
	int bullets;
	Gun(int i) {
		this.bullets = i;
	}
}


class Car {
	double fuel;
	Car(double f) {
		this.fuel = f;
	}
}


interface GetGun {
	Gun get();
}