package com.techchefs.javaapps.learning.jun12.abstraction;

public class ATMMachine {

	void slot(ATMCard card) {
		card.validate();
		card.getInfo();
	}
}
