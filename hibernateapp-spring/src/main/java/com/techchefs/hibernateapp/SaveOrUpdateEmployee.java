package com.techchefs.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class SaveOrUpdateEmployee {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		((AbstractApplicationContext)ctx).registerShutdownHook();
		
		
		
		try (Session session = factory.openSession();) {
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

			employeeInfoBean.setId(30);
			employeeInfoBean.setDepartmentId(20);
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
			session.saveOrUpdate(employeeInfoBean);
			employeeInfoBean.setSalary(3000000);
			session.saveOrUpdate(employeeInfoBean);
			transaction.commit();
			//session.close();
			
		} catch (ParseException e) {
			log.severe(e.getMessage());
		} catch (PersistenceException pe) {
			log.severe("From Catch"+pe.getMessage());
		}

	}
}
