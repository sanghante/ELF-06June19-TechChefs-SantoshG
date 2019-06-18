package com.techchefs.javaapps.learning.jun10.polymorphism;

public class Girl {

	void receive(Phone p) {
		if (p instanceof MiPhone) {
			System.out.println("Thank you, brother!");
		} else if (p instanceof iPhone) {
			System.out.println("I Love You!");
		}
	}
}
