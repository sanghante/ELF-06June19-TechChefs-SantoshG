package com.techchefs.hibernateapp.dto;

/*
 * EMPLOYEE_EDUCATIONAL_INFO
-------------------------
ID (PK) (INT)
EDUCATION_TYPE (PK) (VARCHAR)
DEGREE_TYPE			(VARCHAR)
BRANCH
COLLEGE_NM	(VARCHAR)
UNIVERSITY_NM (VARCHAR)
YEAR_OF_PASSING	(VARCHAR)
PERCENTAGE		(DOUBLE)
LOCATION		(VARCHAR)

 */

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeEducationalInfoBean {
	private int id;           
	private String educationType;
	private String degreeType;	
	private String branch;			 
	private String collegeName;    
	private String university;      
	private Double percentage;      
	private String location;		
	private Date yearOfPassing;             


}//end of class
