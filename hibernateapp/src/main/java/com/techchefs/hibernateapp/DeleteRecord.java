package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

import org.hibernate.Transaction;

@Log
public class DeleteRecord {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tnx = session.beginTransaction();
		
		EmployeeInfoBean employeeInfoBean = session.get(EmployeeInfoBean.class, 21);
		
		log.info(employeeInfoBean.toString());
		
		session.delete(employeeInfoBean);
		tnx.commit();
		session.close();

	}

}
