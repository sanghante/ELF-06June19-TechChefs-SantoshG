package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class StatementExample4 {

	public static void main(String[] args) {

		// 1. Load JDBC driver

		ResultSet rs = null;
		String dbUrl = "jdbc:mysql://localhost:3306/workspace";
		String query = "delete from employee_info where id > 10" ; 

		// 2. Get the "DB Connection" via "Driver"
		try (Connection conn = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = conn.createStatement();) {

			java.sql.Driver sqlDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(sqlDriver);

			log.info(conn.getClass().getName());

			// 3. Issue "SQL Queries" via "Connection"

			int res = stmt.executeUpdate(query);

			// 4. Process the results of the query
			
			log.info("Number of records inserted is "+res);
			
			// 5. Close all "JDBC Objects"

		} catch (SQLException exception) {
			log.info("Exception occured :" + exception.getMessage());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				log.info(e.getMessage());
			}

		} // end of try-catch
	}// end of main
}// End of class
