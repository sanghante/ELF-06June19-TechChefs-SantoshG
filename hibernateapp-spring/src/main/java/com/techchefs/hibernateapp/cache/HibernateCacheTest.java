package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;

import com.techchefs.hibernateapp.util.HibernateCacheUtilold1;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	
	public static void main(String[] args) {
		
		log.info("1st call : " +getEmployeeData(30).toString());
		log.info("2nd call : " +getEmployeeData(30).toString());
		log.info("3rd call : " +getEmployeeData(20).toString());
		
		
	}

	
	private static NewEmployeeInfoBean getEmployeeData(int id) {

		NewEmployeeInfoBean emp;
		try (Session session = HibernateCacheUtilold1.getSessionFactory().openSession();) {
		
			emp = session.get(NewEmployeeInfoBean.class, id);
			log.info(" 1st time : " + emp.toString());
		}
		
		return emp;
		
	}
}
