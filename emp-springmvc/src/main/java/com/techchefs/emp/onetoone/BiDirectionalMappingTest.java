package com.techchefs.emp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.techchefs.emp.manytomany.TrainingInfoBean;
import com.techchefs.emp.manytoone.EmployeeAddressInfoBean;
import com.techchefs.emp.manytoone.EmployeeAddressPKBean;
import com.techchefs.emp.manytoone.EmployeeEducationInfoBean;
import com.techchefs.emp.manytoone.EmployeeEducationPKBean;
import com.techchefs.emp.manytoone.EmployeeExperienceInfoBean;
import com.techchefs.emp.manytoone.EmployeeExperiencePKBean;

import lombok.extern.java.Log;

@Log
public class BiDirectionalMappingTest {

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

		EmployeeInfoBean infoBean = new EmployeeInfoBean();
		infoBean.setId(20);
		infoBean.setName("Lakshmi");		
		infoBean.setDesignation("CEO");		
		
		//Adding OtherInfo
		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setAadhar(456456456);
		otherInfoBean.setPan("ABNC874P");
		otherInfoBean.setBloodGrp("A+ve");
		otherInfoBean.setEmployeeInfoBean(infoBean);		
		
		//Adding AddressInfo
		EmployeeAddressPKBean addressPKBean1 = new EmployeeAddressPKBean();
		addressPKBean1.setAddressType("Present");
		addressPKBean1.setInfoBean(infoBean);
		
		EmployeeAddressPKBean addressPKBean2 = new EmployeeAddressPKBean();
		addressPKBean2.setAddressType("Permanent");
		addressPKBean2.setInfoBean(infoBean);
		 
		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddress1("370, J&K Street");
		addressInfoBean1.setAddress2("No longer a state");
		addressInfoBean1.setAddressPKBean(addressPKBean1);
		addressInfoBean1.setCity("Srinagar");
		addressInfoBean1.setLandmark("Near Dal Lake");
		addressInfoBean1.setState("JK UT"); addressInfoBean1.setCountry("India");
		addressInfoBean1.setPincode(824110);
		 
		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddress1("35A, J&K Street");
		addressInfoBean2.setAddress2("No longer a state");
		addressInfoBean2.setAddressPKBean(addressPKBean2);
		addressInfoBean2.setCity("Srinagar");
		addressInfoBean2.setLandmark("Near Dal Lake");
		addressInfoBean2.setState("JK UT"); addressInfoBean2.setCountry("India");
		addressInfoBean2.setPincode(824111);
		
		//Adding Education Info
		EmployeeEducationPKBean educationPKBean1 = new EmployeeEducationPKBean();
		educationPKBean1.setEducationType("Executive");
		educationPKBean1.setInfoBean(infoBean); 
		EmployeeEducationInfoBean educationInfoBean1 = new EmployeeEducationInfoBean();
		educationInfoBean1.setEducationPKBean(educationPKBean1);
		educationInfoBean1.setBranch("IS");
		educationInfoBean1.setCollegeName("Lovely");
		educationInfoBean1.setDegreeType("ME");
		educationInfoBean1.setLocation("Punjan");
		educationInfoBean1.setPercentage(88.8);
		educationInfoBean1.setUniversity("Lovely University");
		educationInfoBean1.setYearOfPassing(1999);
		 
		EmployeeEducationPKBean educationPKBean2 = new EmployeeEducationPKBean();
		educationPKBean2.setEducationType("Full-Time");
		educationPKBean2.setInfoBean(infoBean); 
		EmployeeEducationInfoBean educationInfoBean2 = new EmployeeEducationInfoBean();
		educationInfoBean2.setEducationPKBean(educationPKBean2);
		educationInfoBean2.setBranch("IS");
		educationInfoBean2.setCollegeName("Lovely");
		educationInfoBean2.setDegreeType("BE");
		educationInfoBean2.setLocation("Punjab");
		educationInfoBean2.setPercentage(91.8);
		educationInfoBean2.setUniversity("Lovely University");
		educationInfoBean2.setYearOfPassing(1997);
		 
		EmployeeExperiencePKBean experiencePKBean1 = new EmployeeExperiencePKBean();
		experiencePKBean1.setExpId(1);
		experiencePKBean1.setInfoBean(infoBean);
		 
		EmployeeExperiencePKBean experiencePKBean2 = new EmployeeExperiencePKBean();
		experiencePKBean2.setExpId(2);
		experiencePKBean2.setInfoBean(infoBean);
		 
		EmployeeExperienceInfoBean experienceInfoBean1 = new EmployeeExperienceInfoBean();
		experienceInfoBean1.setExperiencePKBean(experiencePKBean1);
		experienceInfoBean1.setCompanyName("Cognizant");
		experienceInfoBean1.setDesignation("SA");
		experienceInfoBean1.setJoiningDate(dateJoin);
		experienceInfoBean1.setLeavingDate(dateJoin);
		 
		EmployeeExperienceInfoBean experienceInfoBean2 = new
		EmployeeExperienceInfoBean();
		experienceInfoBean2.setExperiencePKBean(experiencePKBean2);
		experienceInfoBean2.setCompanyName("SPI");
		experienceInfoBean2.setDesignation("SPA");
		experienceInfoBean2.setJoiningDate(dateJoin);
		experienceInfoBean2.setLeavingDate(dateJoin);
		
		
		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseId(201);
		trainingInfoBean.setCourseName("J2EE");
		trainingInfoBean.setCourseType("Online"); 
		trainingInfoBean.setDuration(21);
		trainingInfoBean.setInfoBeans(Arrays.asList(infoBean));
		
		//secondary tables
		infoBean.setOtherInfoBean(otherInfoBean);
		infoBean.setAddressInfoBeans(Arrays.asList(addressInfoBean1, addressInfoBean2));
		infoBean.setEducationInfoBeans(Arrays.asList(educationInfoBean1, educationInfoBean2));
		infoBean.setExperienceInfoBeans(Arrays.asList(experienceInfoBean1, experienceInfoBean2));
		infoBean.setTrainingInfoBeans(Arrays.asList(trainingInfoBean));
		
		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(infoBean);
	}
}
