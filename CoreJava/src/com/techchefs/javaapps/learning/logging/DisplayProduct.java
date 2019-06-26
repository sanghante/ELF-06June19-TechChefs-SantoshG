package com.techchefs.javaapps.learning.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayProduct {

	private static final Logger logger = Logger.getLogger("AppLogger");
	
	void display() {
		
		logger.log(Level.SEVERE, "Severe message captured in display");
		logger.log(Level.WARNING, "Warning message captured in display");
		logger.log(Level.CONFIG, "Config message captured in display");
		logger.log(Level.INFO, "Info message captured in display");
		logger.log(Level.FINE, "Fine message captured in display");
		logger.log(Level.FINER, "Finer message captured in display");
		logger.log(Level.FINEST, "Finest message captured in display");
		
	}
	
	
}
