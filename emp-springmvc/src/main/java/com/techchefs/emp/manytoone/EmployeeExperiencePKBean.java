package com.techchefs.emp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.techchefs.emp.onetoone.EmployeeInfoBean;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@Embeddable
public class EmployeeExperiencePKBean implements Serializable{

	@ManyToOne
	@JoinColumn (name = "ID")
	private EmployeeInfoBean infoBean;
	@Column(name= "company_name")
	private String companyName;
}
