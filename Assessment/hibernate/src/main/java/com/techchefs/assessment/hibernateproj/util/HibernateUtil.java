package com.techchefs.assessment.hibernateproj.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.assessment.hibernateproj.dto.Customer;
import com.techchefs.assessment.hibernateproj.dto.Product;
import com.techchefs.assessment.hibernateproj.dto.Student;

public final class HibernateUtil {

	private HibernateUtil() {}
	
	private static SessionFactory sessionFactory = null;
	
	private static void buildSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(Customer.class);
			cfg.addAnnotatedClass(Product.class);
			cfg.addAnnotatedClass(Student.class);
			cfg.configure();
			
			sessionFactory = cfg.buildSessionFactory();
			
		} 
	}
	
	public static Session getSession() {
		if (sessionFactory == null) {
			buildSessionFactory();
		}
		return sessionFactory.openSession();
	}
}
