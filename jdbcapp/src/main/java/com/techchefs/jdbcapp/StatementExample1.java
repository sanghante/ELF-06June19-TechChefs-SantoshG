package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class StatementExample1 {

	public static void main(String[] args) {

		// 1. Load JDBC driver

		ResultSet rs = null;
		String dbUrl = "jdbc:mysql://localhost:3306/workspace";// ?user=root&password=root";
		String query = "Select * from employee_info where id = 4";

		// 2. Get the "DB Connection" via "Driver"
		try (Connection conn = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = conn.createStatement();) {

			java.sql.Driver sqlDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(sqlDriver);

			log.info(conn.getClass().getName());

			// 3. Issue "SQL Queries" via "Connection"

			rs = stmt.executeQuery(query);

			// 4. Process the results of the query

			int recordNumber = 1;
			if (rs.next()) {

				log.info("*******************Record number*****************" + recordNumber++);
				log.info("Id					===> " + rs.getString("id"));
				log.info("Dept_id				===> " + rs.getInt("dept_id"));
				log.info("Id					===> " + rs.getString(1));
				log.info("Dept_id				===> " + rs.getInt(2));
				log.info("Mngr_id				===> " + rs.getInt("mngr_id"));
				log.info("Name 					===> " + rs.getString("name"));
				log.info("Age					===> " + rs.getInt("age"));
				log.info("Gender				===> " + rs.getString("gender"));
				log.info("Joining Date 			===> " + rs.getDate("joining_date"));
				log.info("Email address 		===> " + rs.getString("email"));
				log.info("Account Nbr			===> " + rs.getInt("account_number"));
				log.info("Phone Nbr				===> " + rs.getInt("phone_number"));
				log.info("Salary				===> " + rs.getDouble("salary"));
				log.info("Designation			===> " + rs.getString("designation"));
				log.info("dob					===> " + rs.getDate("dob"));

			} // end of while

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
