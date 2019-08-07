package com.techchefs.emp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table( name = "DEPARTMENT_INFO")
public class DepartmentInfoBean implements Serializable{
	
	@Id
	@Column(name = "dept_id")
	private int deptId;
	@Column(name = "dept_name")
	private String deptName;

}// end of class
