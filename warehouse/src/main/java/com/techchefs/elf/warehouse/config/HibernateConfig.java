package com.techchefs.elf.warehouse.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.techchefs.elf.warehouse.beans.ItemBean;

@Repository
public class HibernateConfig {
	
	@Bean
	public SessionFactory getHibernateSessionFactory() {
		
		  Configuration cfg = new Configuration(); 
		  cfg.configure("hibernate.cfg.xml"); 
		  cfg.addAnnotatedClass(ItemBean.class); 
		  return cfg.buildSessionFactory();
		  
	}

}
