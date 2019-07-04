package com.techchefs.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class SaveOrUpdateEmployee {

	public static void main(String[] args) {

		try (Session session = HibernateUtil.getSessionFactory().openSession();) {
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

			employeeInfoBean.setId(24);
			employeeInfoBean.setDeptId(20);
			employeeInfoBean.setManagerId(3);
			employeeInfoBean.setAccountNumber(1012458765);
			employeeInfoBean.setDesignation("Senior Software Developer");
			employeeInfoBean.setEmail("piyush.goyal@gmail.com");
			employeeInfoBean.setGender("M");			
			employeeInfoBean.setJoiningDate(formatter.parse("2019-02-06"));
			employeeInfoBean.setName("Piyush Goyal");
			employeeInfoBean.setPhoneNumber("9876543211");
			employeeInfoBean.setSalary(2400000);
			employeeInfoBean.setDob(formatter.parse("1990-01-21"));
			employeeInfoBean.setAge(31);
			
			Transaction transaction = session.beginTransaction();
			session.save(employeeInfoBean);
			transaction.commit();
			session.close();
			
		} catch (ParseException e) {
			log.severe(e.getMessage());
		} catch (PersistenceException pe) {
			log.severe("From Catch"+pe.getMessage());
		}

	}
}
