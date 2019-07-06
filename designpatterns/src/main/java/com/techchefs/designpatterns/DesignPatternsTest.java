package com.techchefs.designpatterns;


import com.techchefs.designpatterns.dto.EmployeeInfoBean;
import com.techchefs.designpatterns.dao.EmployeeDAO;
import com.techchefs.designpatterns.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

/**
 * DesignPatternsTest
 *
 */
@Log
public class DesignPatternsTest {
	
	public static void main(String[] args) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printEmployeeInfo(dao.getEmployeeInfo(1));
		printEmployeeInfo(dao.getEmployeeInfo("2"));
		/*
		 * ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
		 * beans.parallelStream().forEach(DesignPatternsTest::printEmployeeInfo);
		 */		
	}
	
	private static void printEmployeeInfo(EmployeeInfoBean bean) {
		log.info("Retrieved Employee Info from DAO");
		log.info("Designation : "+bean.getDesignation());
		log.info("ID : "+bean.getId());
		log.info("Name : "+bean.getName());
		log.info("Age : "+bean.getAge());
		log.info("Manager ID : "+bean.getManagerId());
		log.info("Department ID : "+bean.getDepartmentId());
		log.info("Salary : "+bean.getSalary());
		log.info("DOB : "+bean.getDob());
		log.info("Email : "+bean.getEmail());
		log.info("Gender : "+bean.getGender());
		log.info("Joining date : "+bean.getJoiningDate());
		log.info("Account number : "+bean.getAccountNumber());
		log.info("Phone number : "+bean.getPhoneNumber());
	}
	
}
