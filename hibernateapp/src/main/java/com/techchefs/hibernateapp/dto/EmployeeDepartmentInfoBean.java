package com.techchefs.hibernateapp.dto;

/*
DEPARTMENT_INFO
---------------
DEPT_ID	(PK) (INT)
DEPT_NAME	 (VARCHAR)

 */

import lombok.Data;

@Data
public class EmployeeDepartmentInfoBean {
	private int deptId ;  
	private String deptName; 


}//end of class
