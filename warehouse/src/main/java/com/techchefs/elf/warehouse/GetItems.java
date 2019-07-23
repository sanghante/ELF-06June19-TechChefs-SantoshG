package com.techchefs.elf.warehouse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.elf.warehouse.beans.ItemBean;
import com.techchefs.elf.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class GetItems {

	public static void main(String[] args) {

//		Configuration cfg =  new Configuration();
//		cfg.configure();
//		cfg.addAnnotatedClass(ItemBean.class);
//		SessionFactory sessionFactory = cfg.buildSessionFactory();		

		ApplicationContext ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = ctx.getBean(SessionFactory.class);

		try (Session session = factory.openSession()) {
			
			ItemBean bean = session.get(ItemBean.class, 1);
			
			log.info("bean name :"+bean.getName());
			log.info("bean desc :"+bean.getDesc());
			log.info("bean cost :"+bean.getCost());
			log.info("bean quantity :"+bean.getQuantity());
			
		} 
	}

}
