package com.techchefs.javaapps.learning.jun17.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestLoggingOne {

	private static final Logger logger = Logger.getLogger("AppLogger");  
	
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);
		
		
		ConsoleHandler ch = new ConsoleHandler(); ch.setLevel(Level.FINEST);
		logger.addHandler(ch);
		 

		logger.log(Level.SEVERE, "Severe message captured");
		logger.log(Level.WARNING, "Warning message captured");
		logger.log(Level.CONFIG, "Config message captured");
		logger.log(Level.INFO, "Info message captured");
		logger.log(Level.FINE, "Fine message captured");
		logger.log(Level.FINER, "Finer message captured");
		logger.log(Level.FINEST, "Finest message captured");
		logger.log(Level.ALL, "Level All message captured");
		logger.log(Level.OFF, "Level OFF message captured");
		
	}

}
