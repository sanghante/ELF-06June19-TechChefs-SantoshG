package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

public class UpdateEmployeeRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, 21);
		
		infoBean.setAge(99);
		infoBean.setDesignation("God");
		Transaction trnx = session.beginTransaction();
		session.update(infoBean);
		trnx.commit();
		session.close();
	}

}
