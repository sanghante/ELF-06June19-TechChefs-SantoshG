package com.techchefs.hibernateapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.techchefs.hibernateapp.manytomany.TrainingInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeAddressPKBean;
import com.techchefs.hibernateapp.manytoone.EmployeeEducationInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeEducationPKBean;
import com.techchefs.hibernateapp.manytoone.EmployeeExperienceInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeExperiencePKBean;

import lombok.extern.java.Log;

@Log
public class GiriDharTest {
	
	public static void main(String[] args) {
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
		
		EmployeeInfoBean empinfo1 = new EmployeeInfoBean();
		empinfo1.setId(2);
		empinfo1.setName("Santosh");
		empinfo1.setAge(25);
		empinfo1.setGender("Male");
		empinfo1.setSalary(135000);
		empinfo1.setPhoneNumber("565689798");
		empinfo1.setEmail("san@gmail.com");
		empinfo1.setDesignation("CEO");
		empinfo1.setDob(dateDOB);
		empinfo1.setAccountNumber(98798089);
		empinfo1.setJoiningDate(dateJoin); 
		empinfo1.setDepartmentId(30);
		
		EmployeeInfoBean empinfo = new EmployeeInfoBean();
		empinfo.setId(1);
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
		empinfo.setManagerId(empinfo1);
		
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
		
		EmployeeAddressPKBean addressPKBean1 = new EmployeeAddressPKBean();
		addressPKBean1.setAddressType("Present");
		addressPKBean1.setInfoBean(empinfo);
		
		EmployeeAddressPKBean addressPKBean2 = new EmployeeAddressPKBean();
		addressPKBean2.setAddressType("Permanent");
		addressPKBean2.setInfoBean(empinfo);
		
		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddress1("370, J&K Street");
		addressInfoBean1.setAddress2("No longer a state");
		addressInfoBean1.setAddressPKBean(addressPKBean1);
		addressInfoBean1.setCity("Srinagar");
		addressInfoBean1.setLandmark("Near Dal Lake");
		addressInfoBean1.setState("JK UT");
		addressInfoBean1.setCountry("India");
		addressInfoBean1.setPincode(824110);
		
		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddress1("35A, J&K Street");
		addressInfoBean2.setAddress2("No longer a state");
		addressInfoBean2.setAddressPKBean(addressPKBean2);
		addressInfoBean2.setCity("Srinagar");
		addressInfoBean2.setLandmark("Near Dal Lake");
		addressInfoBean2.setState("JK UT");
		addressInfoBean2.setCountry("India");
		addressInfoBean2.setPincode(824111);
		
		/*
		 * ArrayList<EmployeeAddressInfoBean> addressInfoBeans = new ArrayList<>();
		 * addressInfoBeans.add(addressInfoBean1);
		 * addressInfoBeans.add(addressInfoBean2);
		 * 
		 * HibernateImpl impl = new HibernateImpl(); impl.createEmployee(empinfo,
		 * otherInfo, addressInfoBeans);
		 */		
		
		EmployeeEducationPKBean educationPKBean1 = new EmployeeEducationPKBean();
		educationPKBean1.setEducationType("Executive");
		educationPKBean1.setInfoBean(empinfo);
		EmployeeEducationInfoBean educationInfoBean1 = new EmployeeEducationInfoBean();
		educationInfoBean1.setEmployeeEducationPKBean(educationPKBean1);
		educationInfoBean1.setBranch("IS");
		educationInfoBean1.setCollegeName("Lovely");
		educationInfoBean1.setDegreeType("ME");
		educationInfoBean1.setLocation("Punjan");
		educationInfoBean1.setPercentage(88.8);
		educationInfoBean1.setUniversity("Lovely University");
		educationInfoBean1.setYearOfPassing(1999);
	
		
		EmployeeEducationPKBean educationPKBean2 = new EmployeeEducationPKBean();
		educationPKBean2.setEducationType("Full-Time");
		educationPKBean2.setInfoBean(empinfo);
		EmployeeEducationInfoBean educationInfoBean2 = new EmployeeEducationInfoBean();
		educationInfoBean2.setEmployeeEducationPKBean(educationPKBean2);
		educationInfoBean2.setBranch("IS");
		educationInfoBean2.setCollegeName("Lovely");
		educationInfoBean2.setDegreeType("BE");
		educationInfoBean2.setLocation("Punjab");
		educationInfoBean2.setPercentage(91.8);
		educationInfoBean2.setUniversity("Lovely University");
		educationInfoBean2.setYearOfPassing(1997);
		
		EmployeeExperiencePKBean experiencePKBean1 = new EmployeeExperiencePKBean();
		experiencePKBean1.setExpId(1);
		experiencePKBean1.setEmployeeInfoBean(empinfo);
		
		EmployeeExperiencePKBean experiencePKBean2 = new EmployeeExperiencePKBean();
		experiencePKBean2.setExpId(2);
		experiencePKBean2.setEmployeeInfoBean(empinfo);
		
		EmployeeExperienceInfoBean experienceInfoBean1 = new EmployeeExperienceInfoBean();
		experienceInfoBean1.setEmployeeEduPKBean(experiencePKBean1);
		experienceInfoBean1.setCompanyName("Cognizant");
		experienceInfoBean1.setDesignation("SA");
		experienceInfoBean1.setJoiningDate(dateJoin);
		experienceInfoBean1.setLeavingDate(dateJoin);
		
		EmployeeExperienceInfoBean experienceInfoBean2 = new EmployeeExperienceInfoBean();
		experienceInfoBean2.setEmployeeEduPKBean(experiencePKBean2);
		experienceInfoBean2.setCompanyName("SPI");
		experienceInfoBean2.setDesignation("SPA");
		experienceInfoBean2.setJoiningDate(dateJoin);
		experienceInfoBean2.setLeavingDate(dateJoin);		
		
		HibernateImpl impl = new HibernateImpl(); 
		
		impl.createEmployee(empinfo,otherInfo, 
				Arrays.asList(addressInfoBean1, addressInfoBean2), 
				Arrays.asList(educationInfoBean1, educationInfoBean2), 
				Arrays.asList(experienceInfoBean1, experienceInfoBean2));
		
		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseId(101);
		trainingInfoBean.setCourseName("Core Java");
		trainingInfoBean.setCourseType("Online");
		trainingInfoBean.setDuration(30);
		trainingInfoBean.setInfoBeans(Arrays.asList(empinfo, empinfo1));
		
		impl.createTrainingInfo(trainingInfoBean);
	}
	
}
