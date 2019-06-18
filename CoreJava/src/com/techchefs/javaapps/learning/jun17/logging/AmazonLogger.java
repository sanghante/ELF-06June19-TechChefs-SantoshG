package com.techchefs.javaapps.learning.jun17.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AmazonLogger {
	
	private static final Logger logger = Logger.getLogger("AmazonLogger");
	
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);
		
		FileHandler fh;
		try {
			fh = new FileHandler("AmazonLogger.log");
			fh.setFormatter(new SimpleFormatter());
			logger.addHandler(fh);
			logger.setLevel(Level.INFO);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		
		
		Register register = new Register();
		register.connectDB();
		
		
		
	}

}
