package com.techchefs.designpatterns.builder;

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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class EmployeeData2 {

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
	
	private EmployeeData2() {}

	public EmployeeData2(EmployeeData2Builder builder) {

		age = builder.age;
		id = builder.id;
		name = builder.name;
		gender = builder.gender;
		salary = builder.salary;
		phoneNumber = builder.phoneNumber;
		email = builder.email;
		designation = builder.designation;
		dob = builder.dob;
		accountNumber = builder.accountNumber;
		joiningDate = builder.joiningDate;
		departmentId = builder.departmentId;
		managerId = builder.managerId;

	}

	public static class EmployeeData2Builder {
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
		
		public EmployeeData2Builder id(int id) {
			this.id = id;
			return this;
		}

		public EmployeeData2Builder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeData2Builder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeData2Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeData2Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeData2Builder phoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public EmployeeData2Builder email(String email) {
			this.email = email;
			return this;

		}

		public EmployeeData2Builder designation(String designation) {
			this.designation = designation;
			return this;
		}

		public EmployeeData2Builder dob(Date dob) {
			this.dob = dob;
			return this;
		}

		public EmployeeData2Builder accountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public EmployeeData2Builder joiningDate(Date joiningDate) {
			this.joiningDate = joiningDate;
			return this;
		}

		public EmployeeData2Builder departmentId(int departmentId) {
			this.departmentId = departmentId;
			return this;

		}

		public EmployeeData2Builder managerId(int managerId) {
			this.managerId = managerId;
			return this;
		}

		public EmployeeData2 build() {
			return new EmployeeData2(this);
		}

	}// End of inner class

}// end of class
