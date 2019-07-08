package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	
	public static void main(String[] args) {
		
		log.info("1st call : " +getEmployeeData(30).toString());
		log.info("2nd call : " +getEmployeeData(30).toString());
		log.info("3rd call : " +getEmployeeData(30).toString());
		
	}

	
	private static NewEmployeeInfoBean getEmployeeData(int Id) {
		//1. Load the config file
		Configuration config = new Configuration();
		config.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);
		//2. Build session factory
		SessionFactory factory = config.buildSessionFactory();
		
		//3. Open session
		Session session = factory.openSession();
		
		//4. Interact with DB
		NewEmployeeInfoBean emp = session.get(NewEmployeeInfoBean.class, 20);
		log.info(" 1st time : " + emp.toString());
		session.close();
		
		return emp;
		
	}
}
