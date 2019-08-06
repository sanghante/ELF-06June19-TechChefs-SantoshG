package com.techchefs.hibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;

@Data
@SuppressWarnings("serial")
@Embeddable
public class EmployeeExperiencePKBean implements Serializable{

	@ManyToOne
	@JoinColumn (name = "id")
	private EmployeeInfoBean infoBean;
	@Column(name = "exp_id")
	private int expId;
}
