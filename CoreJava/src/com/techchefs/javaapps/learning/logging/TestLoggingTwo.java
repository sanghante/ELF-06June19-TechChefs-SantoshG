package com.techchefs.javaapps.learning.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestLoggingTwo {
	
	private static final Logger logger = Logger.getLogger("AppLogger");
	
	public static void main(String args[]) {
		
		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);
		
		try {
			
			logger.log(Level.INFO, "Entered main");
			FileHandler fh = new FileHandler("MyAppFileLogger.log", true);
			fh.setFormatter(new SimpleFormatter());
			fh.setLevel(Level.INFO);
			
			logger.addHandler(fh);
			
			logger.log(Level.INFO, "created displayproduct object");
			DisplayProduct displayProduct = new DisplayProduct();
			logger.log(Level.INFO, "calling display method");
			displayProduct.display();			
			logger.log(Level.INFO, "display successful");
			logger.log(Level.INFO, "Exiting main");
 			
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
			
		}
		
	}
}
