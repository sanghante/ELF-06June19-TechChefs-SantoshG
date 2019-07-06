package com.techchefs.designpatterns.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.techchefs.designpatterns.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException nfe) {
			log.severe("Exception occured while trying to convert parameter id to Integer. id = "+id);
			log.severe(nfe.getMessage());
			return null;
		}
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {

		ResultSet rs = null;
		String dbUrl = "jdbc:mysql://localhost:3306/workspace";
		String query = "Select * from employee_info where id = ?";
		EmployeeInfoBean bean = null;

		try (Connection conn = DriverManager.getConnection(dbUrl, "root", "root");
				PreparedStatement stmt = conn.prepareStatement(query);) {

			log.info(conn.getClass().getName());
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			bean = new EmployeeInfoBean();
			while (rs.next()) {
				bean.setAccountNumber(rs.getLong("account_number"));
				bean.setDepartmentId(rs.getInt("dept_id"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDob(rs.getDate("dob"));
				bean.setEmail(rs.getString("email"));
				bean.setGender(rs.getString("gender"));
				bean.setId(rs.getInt("id"));
				bean.setJoiningDate(rs.getDate("joining_date"));
				bean.setManagerId(rs.getInt("mngr_id"));
				bean.setName(rs.getString("name"));
				bean.setAge(rs.getInt("age"));
				bean.setPhoneNumber(rs.getString("phone_number"));
				bean.setSalary(rs.getDouble("salary"));
			} // end of while
			return bean;
		} catch (SQLException exception) {
			log.info("Exception occured :" + exception.getMessage());
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				log.info(e.getMessage());
			}
		} // end of try-with-resources
	}
	
	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		String dbUrl = "jdbc:mysql://localhost:3306/workspace";
		String query = "Select * from employee_info";
		// 1. Load JDBC driver
		// 2. Get the "DB Connection" via "Driver"
		// 3. Issue "SQL Queries" via "Connection"
		try (Connection conn = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			// 4. Process the results of the query
			ArrayList<EmployeeInfoBean> beans = new ArrayList<>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setAccountNumber(rs.getInt("account_number"));
				bean.setDepartmentId(rs.getInt("dept_id"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDob(rs.getDate("dob"));
				bean.setEmail(rs.getString("email"));
				bean.setGender(rs.getString("gender"));
				bean.setId(rs.getInt("id"));
				bean.setJoiningDate(rs.getDate("joining_date"));
				bean.setManagerId(rs.getInt("mngr_id"));
				bean.setName(rs.getString("name"));
				bean.setAge(rs.getInt("age"));
				bean.setPhoneNumber(rs.getString("phone_number"));
				bean.setSalary(rs.getDouble("salary"));
				
				beans.add(bean);
			} // end of while
			return beans;
		} catch (SQLException exception) {
			log.info("Exception occured :" + exception.getMessage());
			return null;
		} // end of try-catch
	}// end of main

}// End of class
