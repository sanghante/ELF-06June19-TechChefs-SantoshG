package com.techchefs.hibernateapp.onetoone;

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
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.techchefs.hibernateapp.manytomany.TrainingInfoBean;
import com.techchefs.hibernateapp.manytoone.DepartmentInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeEducationInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeExperienceInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable {

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employeeInfoBean")
	private EmployeeOtherInfoBean otherInfoBean;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "experiencePKBean.infoBean")
	private List<EmployeeExperienceInfoBean> experienceInfoBeans;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationPKBean.infoBean")
	private List<EmployeeEducationInfoBean> educationInfoBeans;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBeans;
	
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
	
//	@Column(name="dept_id")
//	private int departmentId;
	
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "Dept_id")
	private DepartmentInfoBean departmentBean;
	
	@Column(name="age")
	private int age;
	
//	@Column(name="mngr_id")
//	private int managerId;
	
	@ManyToOne
	@JoinColumn( name="Mngr_id", referencedColumnName = "id")
	private EmployeeInfoBean managerId;

}//end of class
