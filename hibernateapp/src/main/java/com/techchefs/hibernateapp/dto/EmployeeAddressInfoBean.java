package com.techchefs.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 EMPLOYEE_ADDRESS
----------------
EMP_ID		(PK) (INT)
ADDRESS_TYPE (PK)(VARCHAR)
ADDRESS_1		(VARCHAR)
ADDRESS_2		(VARCHAR)
LANDMARK		(VARCHAR)
CITY			(VARCHAR)
STATE			(VARCHAR)
COUNTRY			(VARCHAR)
PIN_CODE		(INT)
 */
import lombok.Data;

@Data
@Entity
@Table(name="employee_address")
public class EmployeeAddressInfoBean {
	
	@Id
	@Column(name="id")
	private int id ;
	@Column(name="address_type")
	private String addressType;
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


}//end of class
