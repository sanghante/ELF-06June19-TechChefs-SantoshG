package com.techchefs.hibernateapp.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
@Table( name = "employee_experience_info")
public class EmployeeExperienceInfoBean implements Serializable{
	
	@EmbeddedId
	private EmployeeExperiencePKBean experiencePKBean; 
	@Column(name= "company_name")
	private String companyName;
	@Column(name= "designation")
	private String designation;
	@Column(name= "joining_Date")
	private Date joiningDate;
	@Column(name= "leaving_Date")
	private Date leavingDate;

}
