package com.techchefs.jdbcapp.common;

public class TestDependencyInjection {

	public static void main(String[] args) {
		
		Connection con  = null;
		
		con = DriverManager.getConnection(args[0]);
		con.printMessage();

	}

}
