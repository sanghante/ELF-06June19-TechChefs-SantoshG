package com.techchefs.javaapps.learning.coupling;

public class Person {

	void receive(Bottle bottle) {
		bottle.open();
		bottle.drink();
	}
}
