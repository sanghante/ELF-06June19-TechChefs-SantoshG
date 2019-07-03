package com.techchefs.jdbcapp.exceptions;

public class JDBCApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JDBCApplicationException() {
	}

	public JDBCApplicationException(String message) {
		super(message);
	}

	public JDBCApplicationException(Throwable cause) {
		super(cause);
	}

	public JDBCApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public JDBCApplicationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
