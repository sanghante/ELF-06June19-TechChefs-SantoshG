package com.techchefs.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class SaveDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		try (SessionFactory factory = cfg.buildSessionFactory();
				Session session = factory.openSession();) {
			
			//cfg.addAnnotatedClass(EmployeeInfoBean.class);

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

			employeeInfoBean.setId(22);
			employeeInfoBean.setDepartmentId(20);
			employeeInfoBean.setManagerId(3);
			employeeInfoBean.setAccountNumber(1012458765);
			employeeInfoBean.setDesignation("Director");
			employeeInfoBean.setEmail("rajesh.goyal@gmail.com");
			employeeInfoBean.setGender("M");			
			employeeInfoBean.setJoiningDate(formatter.parse("2018-02-06"));
			employeeInfoBean.setName("Rajesh Goyal");
			employeeInfoBean.setPhoneNumber("9876543211");
			employeeInfoBean.setSalary(2400000);
			employeeInfoBean.setDob(formatter.parse("1970-01-21"));
			employeeInfoBean.setAge(49);
			
			Transaction transaction = session.beginTransaction();
			session.save(employeeInfoBean);
			
			employeeInfoBean.setAge(55);			
			transaction.commit();			
			session.close();
			
		} catch (ParseException e) {
			log.severe(e.getMessage());
		} catch (PersistenceException pe) {
			log.severe("From Catch"+pe.getMessage());
		}

	}
}
