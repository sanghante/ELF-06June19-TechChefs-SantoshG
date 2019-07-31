package com.techchefs.assessment.hibernateproj.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

public class StudentOtherInfo {
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentInfo studentInfo; 
	
	@Column(name="fatherName")
	private String fatherName;
	
	@Column(name="motherName")
	private String motherName;
	
	@Column(name="religion")
	private String religion;
	
	@Column(name="nationality")
	private String nationality;
	

}
