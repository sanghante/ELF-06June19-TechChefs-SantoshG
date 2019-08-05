package com.techchefs.hibernateapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class PrepareDataUtil {
	
	private PrepareDataUtil() {}
	
	public static EmployeeInfoBean prepareData(int id) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date dateDOB = null;
		try {
			dateDOB = dateFormat.parse("1990-05-01");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		Date dateJoin = null;
		try {
			dateJoin = dateFormat.parse("2019-05-01");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		
		EmployeeInfoBean empinfo = new EmployeeInfoBean();
		empinfo.setId(id);
		empinfo.setName("Nistha");
		empinfo.setAge(25);
		empinfo.setGender("Female");
		empinfo.setSalary(35000);
		empinfo.setPhoneNumber("565689798");
		empinfo.setEmail("nish@gmail.com");
		empinfo.setDesignation("Manager");
		empinfo.setDob(dateDOB);
		empinfo.setAccountNumber(98798089);
		empinfo.setJoiningDate(dateJoin); 
		empinfo.setDepartmentId(30);
		//empinfo.setManagerId(3);
		
		EmployeeOtherInfoBean otherInfo = new EmployeeOtherInfoBean();
		//otherInfo.setId(1);
		otherInfo.setEmployeeInfoBean(empinfo);
		otherInfo.setIsmarried(false);
		otherInfo.setPan("CMFDG2341k");
		otherInfo.setBloodGrp("A+");
		otherInfo.setEmergencyContactName("Rajesh");
		otherInfo.setEmergencyContactNumber(678687980);
		otherInfo.setNationality("Indian");
		otherInfo.setReligion("Hindu");
		otherInfo.setFatherName("Mahadev");
		otherInfo.setMotherName("Mahamata");
		otherInfo.setPassport("M89778");
		otherInfo.setAadhar(787889L);
		
		//empinfo.setOtherInfo(otherInfo);
		return empinfo;
		
	}

}
