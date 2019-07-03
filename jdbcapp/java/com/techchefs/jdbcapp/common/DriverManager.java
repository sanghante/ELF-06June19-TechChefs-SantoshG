package com.techchefs.jdbcapp.common;

public class DriverManager {

	private DriverManager() {
	}

	public static Connection getConnection(String str) {
		if (str.equals("one")) {
			return new ClassA();
		} else {
			return new ClassB();
		}

	}
}
