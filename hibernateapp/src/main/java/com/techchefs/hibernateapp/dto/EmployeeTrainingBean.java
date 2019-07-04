package com.techchefs.hibernateapp.dto;

/*

EMPLOYEE_TRAINING
-----------------
ID			(PK)	(INT)
COURSE_ID	(PK)	(INT)
*/

import lombok.Data;

@Data
public class EmployeeTrainingBean {
	
	private int id;        
	private int courseId ;


}
