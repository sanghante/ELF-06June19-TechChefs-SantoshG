package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.cache.NewEmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {
	
	public static void main(String[] args) {
		
		//1. Load the config file
		Configuration config = new Configuration();
		config.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);
		
		//2. Build session factory
		SessionFactory factory = config.buildSessionFactory();
		
		//3. Open session
		Session session = factory.openSession();
		
		//4. Interact with DB
		NewEmployeeInfoBean emp1 = session.get(NewEmployeeInfoBean.class, 20);
		log.info(" 1st time : " + emp1.toString());
		
		NewEmployeeInfoBean emp2 = session.get(NewEmployeeInfoBean.class, 20);
		log.info(" 2nd time : " + emp2.toString());

		NewEmployeeInfoBean emp3 = session.get(NewEmployeeInfoBean.class, 20);
		log.info(" 3rd time : " + emp3.toString());

		//5. Close the session.
		session.close();
	}

}
