package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.techchefs.jdbcapp.connectionpool.ConnectionPool;
import com.techchefs.jdbcapp.exceptions.JDBCApplicationException;

import lombok.extern.java.Log;

@Log
public final class ConnectionPoolTest {

	public static void main(String[] args) {

		Connection con = null;
		ConnectionPool pool = null;

		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();
			executeQuery(con);

		} catch (JDBCApplicationException e) {
			log.severe("Error while getting connection from pool : " + e.getMessage());
		} finally {
			if (pool !=null) {
				pool.returnConnectionToPool(con);
			}
		}

	}// end of main
	
	private static void executeQuery(Connection con) {
		String query = "Select * from employee_info where id = 1";
		try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query);) {
			// 4. Process the results of the query
			int recordNumber = 1;
			while (rs.next()) {
				log.info("*******************Record number*****************" + recordNumber++);
				log.info("Id					===> " + rs.getString("id"));
				log.info("Dept_id				===> " + rs.getInt("dept_id"));
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
		} catch (SQLException exception) {
			log.info("Exception occured :" + exception.getMessage());
		} // end of try-catch		
	}
	
}// End of class
