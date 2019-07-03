package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class PreparedStatementExample4 {

	public static void main(String[] args) {

		// 1. Load JDBC driver

		ResultSet rs = null;
		String dbUrl = "jdbc:mysql://localhost:3306/workspace";// ?user=root&password=root";
		String query = "insert into workspace.employee_info"
		+ "(id, dept_id, mngr_id, name, age, gender, joining_date, email, account_number, phone_number, salary, designation, dob)"
		+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ; 
				
		

		// 2. Get the "DB Connection" via "Driver"
		try (Connection conn = DriverManager.getConnection(dbUrl, "root", "root");
				PreparedStatement stmt = conn.prepareStatement(query)) {

			java.sql.Driver sqlDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(sqlDriver);

			log.info(conn.getClass().getName());

			// 3. Issue "SQL Queries" via "Connection"
			
			stmt.setInt(1, 14);
			stmt.setInt(2, 10);
			stmt.setInt(3, 3);
			stmt.setString(4, "Inserted From Java");
			stmt.setInt(5, 33);
			stmt.setString(6, "M");
			stmt.setDate(7, new Date(2019, 01, 23));
			stmt.setString(8, "java@sql.com");
			stmt.setInt(9, 123456789);
			stmt.setInt(10, 232142836);
			stmt.setInt(11, 9999);
			stmt.setString(12, "Java Developer");
			stmt.setDate(13, new Date(1989, 02, 28));

			int res = stmt.executeUpdate();

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
