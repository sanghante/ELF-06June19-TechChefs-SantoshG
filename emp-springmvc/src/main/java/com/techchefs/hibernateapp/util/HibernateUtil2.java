package com.techchefs.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//problem here is that class can be extended and getSessionFactory() can be modified in extended class.
public class HibernateUtil2 {

	private static SessionFactory sessionFactory = null;
	private static SessionFactory buildSessionFactory() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		return cfg.buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}

}
