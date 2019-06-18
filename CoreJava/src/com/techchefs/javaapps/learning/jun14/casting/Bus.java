package com.techchefs.javaapps.learning.jun14.casting;

public class Bus {

	int model;
	void move() {
		System.out.println("Bus move");
	}
}

class Van extends Bus {
	int seats;
	void turn() {
		System.out.println("Van turns");
	}
}
