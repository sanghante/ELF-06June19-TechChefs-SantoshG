package com.techchefs.javaapps.learning.jun13.accessspecifiers;

public class Son extends Father {

	void use() {
		//atm(); // no access to atm		
		car();
		bike();
		cycle();
	}
	
}
