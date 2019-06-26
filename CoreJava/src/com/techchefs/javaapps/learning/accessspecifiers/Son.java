package com.techchefs.javaapps.learning.accessspecifiers;

public class Son extends Father {

	void use() {
		//atm(); // no access to atm		
		car();
		bike();
		cycle();
	}
	
}
