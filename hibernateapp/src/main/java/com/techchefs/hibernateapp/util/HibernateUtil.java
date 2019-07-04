package com.techchefs.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {

	private SessionFactory sessionFactory = null;
	private HibernateUtil() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
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
