package com.techchefs.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtil {
	
	private static SessionFactory sessionFactory = null;
	private HibernateCacheUtil() {}
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml");
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
