/**
 * 
 */
package com.techchefs.javaapps.learning.exceptionhandling;

/**
 * @author Administrator
 * Test this class by creating a validator class which will disallow name if length < 5
 *
 */
public class NameDisallowedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public NameDisallowedException (String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
}
