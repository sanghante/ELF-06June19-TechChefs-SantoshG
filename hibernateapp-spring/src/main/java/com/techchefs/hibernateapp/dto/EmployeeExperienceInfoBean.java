package com.techchefs.hibernateapp.dto;

/*
 * EMPLOYEE_EXPERIENCE_INFO
------------------------
ID	(PK)	(INT)
COMPANY_NM (PK)(VARCHAR)
DESIGNATION	(VARCHAR)
JOINING_DATE	(DATE)
LEAVING_DATE	(DATE)

 */

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeExperienceInfoBean {
	private int id ;         
	private String companyName;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;


}//end of class
