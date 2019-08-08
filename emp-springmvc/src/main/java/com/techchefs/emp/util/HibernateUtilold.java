package com.techchefs.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.emp.dto.EmployeeInfoBean1;
import com.techchefs.emp.dto.EmployeeOtherInfoBean1;

public final class HibernateUtilold {

	private static SessionFactory sessionFactory = null;

	private HibernateUtilold() {}

	private static SessionFactory buildSessionFactory() {
		return new Configuration()
				.configure()
				.addAnnotatedClass(EmployeeInfoBean1.class)
				.addAnnotatedClass(EmployeeOtherInfoBean1.class)
				.buildSessionFactory();		
	}
	
	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public static Session getSession() {
		return getSessionFactory().openSession();
	}

}
