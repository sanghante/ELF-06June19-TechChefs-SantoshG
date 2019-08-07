package com.techchefs.emp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "EMPLOYEE_ADDRESS_INFO")
@Data
public class EmployeeAddressInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeAddressPKBean addressPKBean;	
	@Column(name="address_1")
	private String address1;
	@Column(name="address_2")
	private String address2;
	@Column(name="landmark")
	private String landmark;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pin_code")
	private int pincode;		
}
