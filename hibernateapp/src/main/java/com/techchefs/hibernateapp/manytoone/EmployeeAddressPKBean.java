package com.techchefs.hibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;


@SuppressWarnings("serial")
@Data
@Embeddable
public class EmployeeAddressPKBean implements Serializable{


	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;	
	@Column(name="address_type")
	private String addressType;
}
