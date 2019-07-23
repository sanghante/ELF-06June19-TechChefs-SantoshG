package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadEmployeeRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, 21);
		log.info(infoBean.toString());
		
		session.close();
	}

}
