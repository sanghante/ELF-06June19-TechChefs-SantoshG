package com.techchefs.hibernateapp.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.techchefs.hibernateapp.dto.EmployeeAddressInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeDepartmentInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeOtherInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

@Repository
public class HibernateConfig {
	
	@Bean
	public SessionFactory getHibernateSessionFactory() {
		
		  Configuration cfg = new Configuration(); 
		  cfg.configure("hibernate.cfg.xml"); 
		 // cfg.addAnnotatedClass(EmployeeInfoBean.class); 
		  cfg.addAnnotatedClass(com.techchefs.hibernateapp.onetoone.EmployeeInfoBean.class);
		 // cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);
		  cfg.addAnnotatedClass(com.techchefs.hibernateapp.onetoone.EmployeeOtherInfoBean.class);
		  cfg.addAnnotatedClass(EmployeeAddressInfoBean.class);
		  cfg.addAnnotatedClass(EmployeeDepartmentInfoBean.class);
		  return cfg.buildSessionFactory();
		  
	}

}
