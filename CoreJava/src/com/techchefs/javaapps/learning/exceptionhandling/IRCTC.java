package com.techchefs.javaapps.learning.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class IRCTC {
	
	void book(String details, int num) throws IOException, ArithmeticException, NullPointerException {
		File file = new File("san.txt");
		
		System.out.println("IRCTC: Booking ticket now ...");
		
		try {			
			if (details.length() > 0 ) {
				System.out.println("IRCTC: Received details ...");							
				file.createNewFile();
				if (10/num > 1) {
					System.out.println("IRCTC: Received good number ...");
				}
			}
			
		} catch (IOException ioException) {
			System.out.println("IRCTC: Got an io exception, try again later");
			throw ioException;
		
		} catch (NullPointerException npeException) {
			System.out.println("IRCTC: Got a null pointer exceptions, contact helpdesk");
			throw npeException;
		
		} catch (ArithmeticException arithmeticException) {
			System.out.println("IRCTC: Got an airthmetic Exception, contact developer");
			throw arithmeticException;
		
		} finally {
			System.out.println("IRCTC: If you are lucky, you will get a ticket soon!");
		}
		
		System.out.println("IRCTC: Booking complete");
	}

}
