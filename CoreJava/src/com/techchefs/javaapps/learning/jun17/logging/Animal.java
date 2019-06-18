package com.techchefs.javaapps.learning.jun17.logging;

import java.util.logging.Logger;

public abstract class Animal {
	
	abstract void sound();
	
	private static final Logger LOGGER = Logger.getLogger("AppLogger");
	
	int divisible(int a, int b) {
		return a/b;
	}

}
