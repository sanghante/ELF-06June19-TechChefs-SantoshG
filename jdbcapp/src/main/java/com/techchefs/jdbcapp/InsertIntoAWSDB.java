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
public class InsertIntoAWSDB {

	public static void main(String[] args) {

		// 1. Load JDBC driver

		
		String dbUrl = "jdbc:mysql://techchefstrainingdb.cvje2z1fhvks.ap-south-1.rds.amazonaws.com:3306/elfdb";
		String query = "insert into employee_info"
		+ "(id, dept_id, mngr_id, name, age, gender, joining_date, email, account_number, phone_number, salary, designation, dob)"
		+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ; 
				
		

		// 2. Get the "DB Connection" via "Driver"
		try (Connection conn = DriverManager.getConnection(dbUrl, "root", "techchefs123");
				PreparedStatement stmt = conn.prepareStatement(query);) {
			
			stmt.setInt(1, 18);
			stmt.setInt(2, 10);
			stmt.setInt(3, 3);
			stmt.setString(4, "Inserted From Java");
			stmt.setInt(5, 33);
			stmt.setString(6, "M");
			stmt.setString(7, "2019-12-13");
			stmt.setString(8, "java@sql.com");
			stmt.setInt(9, 123456789);
			stmt.setInt(10, 232142836);
			stmt.setInt(11, 9999);
			stmt.setString(12, "Java Developer");
			stmt.setString(13, "1991-01-23");

			// 4. Process the results of the query
			int res = stmt.executeUpdate();
			
			log.info("Number of records inserted is "+res);
			
			// 5. Close all "JDBC Objects"

		} catch (SQLException exception) {
			log.info("Exception occured :" + exception.getMessage());
		}// end of try-catch
	}// end of main
}// End of class
