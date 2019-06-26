package com.techchefs.javaapps.learning.abstraction;

public class ATMMachine {

	void slot(ATMCard card) {
		card.validate();
		card.getInfo();
	}
}
