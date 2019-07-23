package com.techchefs.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernateapp.onetoone.EmployeeOtherInfoBean;

public final class HibernateUtilold {

	private SessionFactory sessionFactory = null;
	private HibernateUtilold() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml")
			.addAnnotatedClass(EmployeeInfoBean.class)
			.addAnnotatedClass(EmployeeOtherInfoBean.class);
		sessionFactory = cfg.buildSessionFactory();
		
	}
	private static HibernateUtilold util = null;
	
	public static SessionFactory getSessionFactory() {
		if (util == null) {
			util = new HibernateUtilold();
		}
		return util.sessionFactory;
	}

}
