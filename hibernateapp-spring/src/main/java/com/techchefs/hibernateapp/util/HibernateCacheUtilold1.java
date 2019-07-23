package com.techchefs.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtilold1 {
	
	private static SessionFactory sessionFactory = null;
	private HibernateCacheUtilold1() {}
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml");
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
