package com.techchefs.javaapps.learning.coupling;

public class Baby {

	void receive(Chips chips) {
		chips.open();
		chips.eat();
	}
}
