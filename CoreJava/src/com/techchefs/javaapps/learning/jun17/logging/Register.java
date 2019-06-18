package com.techchefs.javaapps.learning.jun17.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {

	private static final Logger LOGGER = Logger.getLogger("AmazonLogger");
	
	void connectDB() {
		
		LOGGER.log(Level.INFO, "entered connectDB method");
		
		System.out.println("Connected to db");
		
		LOGGER.log(Level.INFO, "exiting connectDB method");
		
	}
}
