package com.techchefs.designpatterns.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.designpatterns.dto.EmployeeInfoBean;

public final class HibernateUtil {

	private static SessionFactory sessionFactory = null;
	private HibernateUtil() {}

	private static SessionFactory buildSessionFactory() {
		return new Configuration()
				.configure()
				.addAnnotatedClass(EmployeeInfoBean.class)
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
