package com.techchefs.mywebapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.mywebapp.dto.EmployeeDepartmentInfoBean;
import com.techchefs.mywebapp.dto.EmployeeInfoBean;

public final class HibernateUtil {

	private static SessionFactory sessionFactory = null;
	
	int[] a = new int[]{2,4};
	int[] b = {2,4};
	
	private HibernateUtil() {}

	private static SessionFactory buildSessionFactory() {
		return new Configuration()
				.configure()
				.addAnnotatedClass(EmployeeInfoBean.class)
				.addAnnotatedClass(EmployeeDepartmentInfoBean.class)
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
