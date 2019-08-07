package com.techchefs.emp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.techchefs.emp.onetoone.EmployeeInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Embeddable
public class EmployeeEducationPKBean implements Serializable {

	@ManyToOne
	@JoinColumn(name = "ID")	
	private EmployeeInfoBean infoBean;
	@Column( name = "education_type")
	private String educationType;

}
