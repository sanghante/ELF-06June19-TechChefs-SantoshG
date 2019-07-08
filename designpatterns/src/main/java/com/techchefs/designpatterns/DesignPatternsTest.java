package com.techchefs.designpatterns;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.techchefs.designpatterns.dao.EmployeeDAO;
import com.techchefs.designpatterns.dao.EmployeeDAOFactory;
import com.techchefs.designpatterns.dto.EmployeeInfoBean;

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
		
		
		ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
		beans.parallelStream().forEach(DesignPatternsTest::printEmployeeInfo);
		
		//create EmployeeInfoBean and save
		EmployeeInfoBean bean = createEmployee();
		dao.createEmployeeInfo(bean);
		
		dao.updateEmployeeInfo(bean);
		
		dao.deleteEmployeeInfo(32);
		
	}
	
	private static EmployeeInfoBean createEmployee() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

		employeeInfoBean.setId(32);
		employeeInfoBean.setDepartmentId(20);
		employeeInfoBean.setManagerId(3);
		employeeInfoBean.setAccountNumber(1012458765);
		employeeInfoBean.setDesignation("Director");
		employeeInfoBean.setEmail("debug.test@gmail.com");
		employeeInfoBean.setGender("M");			
		try {
			employeeInfoBean.setDob(formatter.parse("1970-01-21"));
			employeeInfoBean.setJoiningDate(formatter.parse("2018-02-06"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		employeeInfoBean.setName("Rajesh Goyal");
		employeeInfoBean.setPhoneNumber("9876543211");
		employeeInfoBean.setSalary(2400000);		
		employeeInfoBean.setAge(49);
		
		return employeeInfoBean;

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
