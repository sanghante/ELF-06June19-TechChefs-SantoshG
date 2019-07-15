package com.techchefs.mywebapp.dto;

import java.io.Serializable;

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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_info")
@Data
public class EmployeeInfoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="account_number")
	private long accountNumber;
	
	@Column(name="joining_date")
	private Date joiningDate;
	
	@Column(name="dept_id")
	private int departmentId;
	
	@Column(name="mngr_id")
	private int managerId;
	
	@Column(name="age")
	private int age;
	
	
	@Override
	public String toString() {
		return "EmployeeInfoBean [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", designation=" + designation + ", dob=" + dob
				+ ", accountNumber=" + accountNumber + ", joiningDate=" + joiningDate + ", deptId=" + departmentId
				+ ", managerId=" + managerId + ", age=" + age + "]";
	}
	

}//end of class
