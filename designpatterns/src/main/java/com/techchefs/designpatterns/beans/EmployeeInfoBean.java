package com.techchefs.designpatterns.beans;

/*
EMPLOYEE_INFO
-------------
ID (PK) 	(INT)
DEPT_ID	(FK)(INT)
MNGR_ID		(INT)
NAME		(VARCHAR)
AGE			(INT)
GENDER		(VARCHAR)
JOINING_DATE	(DATE)
EMAIL			(VARCHAR)
ACCOUNT_NUMBER	(LONG)
PHONE_NUMBER	(LONG)
SALARY			(DOUBLE)
DESIGNATION		(VARCHAR)
DOB				(DATE)

*/

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeInfoBean {
	
	private int id;
	private int age;
	private String name;
	private String gender;
	private double salary;
	private long phoneNumber;
	private String email;
	private String designation;
	private Date dob;
	private long accountNumber;
	private Date joiningDate;
	private int departmentId;
	private int managerId;
	

}//end of class