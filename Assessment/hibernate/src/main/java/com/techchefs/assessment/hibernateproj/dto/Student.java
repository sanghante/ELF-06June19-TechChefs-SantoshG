package com.techchefs.assessment.hibernateproj.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*
 * rollNum(PK)  int
firstName    varchar(120)
lastName     varchar(100)
subject      varchar(150)
totalMarks   double
 */

@Data
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="rollNum")
	int rollNum;
	@Column(name="firstName")
	String firstName;
	@Column(name="lastName")
	String lastName;
	@Column(name="subject")
	String subject;
	@Column(name="totalMarks")
	double totalMarks;

}
