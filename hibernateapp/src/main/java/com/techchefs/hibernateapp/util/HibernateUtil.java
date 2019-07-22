package com.techchefs.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernateapp.onetoone.EmployeeOtherInfoBean;

public final class HibernateUtil {

	private SessionFactory sessionFactory = null;
	private HibernateUtil() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml")
			.addAnnotatedClass(EmployeeInfoBean.class)
			.addAnnotatedClass(EmployeeOtherInfoBean.class);
		sessionFactory = cfg.buildSessionFactory();
		
	}
	private static HibernateUtil util = null;
	
	public static SessionFactory getSessionFactory() {
		if (util == null) {
			util = new HibernateUtil();
		}
		return util.sessionFactory;
	}

}
