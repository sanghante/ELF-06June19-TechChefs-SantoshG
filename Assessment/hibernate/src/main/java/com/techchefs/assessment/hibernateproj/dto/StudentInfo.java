package com.techchefs.assessment.hibernateproj.dto;

import javax.persistence.Column;
import javax.persistence.Id;

/*
 * Table Name –  Student_info
rollNum(PK)   int
name          varchar(120)
age           int
gender        varchar(120)
mobileNo      long
emailId       varchar(150)
 */
public class StudentInfo {
	
	@Id
	@Column(name ="rollNum")	
	private int rollNum;
	@Column(name ="name")
	private String name;
	@Column(name ="age")
	private int age;
	@Column(name ="gender")
	private String gender;
	@Column(name ="mobileNo")
	private long mobileNo;
	@Column(name ="emailId")
	private String emailId;
	

}
