package com.techchefs.mywebapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
DEPARTMENT_INFO
---------------
DEPT_ID	(PK) (INT)
DEPT_NAME	 (VARCHAR)

 */

import lombok.Data;

@Entity
@Data
@Table(name="department_info")
public class EmployeeDepartmentInfoBean {
	
	
	@Id
	@Column(name="dept_id")
	private int deptId ;
	@Column(name="dept_name")
	private String deptName; 


}//end of class
