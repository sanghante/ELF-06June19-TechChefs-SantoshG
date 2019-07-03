package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class PreparedStatementExample3 {

	public static void main(String[] args) {

		// 1. Load JDBC driver

		ResultSet rs = null;
		String dbUrl = "jdbc:mysql://localhost:3306/workspace";// ?user=root&password=root";
		String query = "insert into workspace.employee_info"
		+ "(id, dept_id, mngr_id, name, age, gender, joining_date, email, account_number, phone_number, salary, designation, dob)"
		+ "values (13, 10, 10, 'Santosh', '37', 'M', '2019-06-06', 'santosh.ghante@gmail.com', 12345, 1234567890, 30000000, 'tech lead', '1981-04-10')" ; 
				
		

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
