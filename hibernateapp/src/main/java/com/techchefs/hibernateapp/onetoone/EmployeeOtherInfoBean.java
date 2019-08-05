package com.techchefs.hibernateapp.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * EMPLOYEE_OTHER_INFO
-------------------
ID	(PK)	(INT)
PASSPORT	(VARCHAR)
AADHAR		(LONG)
PAN			(VARCHAR)
ISMARRIED	(BOOLEAN)
BLOOD_GRP	(VARCHAR)
EMERGENCY_CONTACT_NAME	(VARCHAR)
EMERGENCY_CONTACT_NUMBER	(LONG)
NATIONALITY	(VARCHAR)
RELIGION	(VARCHAR)
FATHER_NM	(VARCHAR)
MOTHER_NM	(VARCHAR)
SPOUSE_NAME	(VARCHAR)

 */

import lombok.Data;

@Data
@Entity
@Table(name="employee_other_info")
public class EmployeeOtherInfoBean  implements Serializable{
	
	@Id
	@JoinColumn(name = "id")
	@OneToOne
	EmployeeInfoBean employeeInfoBean;
	
	@Column(name="ismarried")
	private boolean ismarried;
	@Column(name="pan")
	private String pan;
	@Column(name="blood_group")
	private String bloodGrp;
	@Column(name="emergency_cntc_nbr")
	private long emergencyContactNumber;
	@Column(name="emergency_cntc_nm")
	private String emergencyContactName;
	@Column(name="nationality")
	private String nationality;
	@Column(name="religion")
	private String religion;
	@Column(name="father_nm")
	private String fatherName;
	@Column(name="mother_nm")
	private String motherName;
	@Column(name="passport_nbr")
	private String passport;
	@Column(name="aadhar_nbr")
	private long aadhar;					  


}//end of class
