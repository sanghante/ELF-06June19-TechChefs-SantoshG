package com.techchefs.elf.warehouse;

import java.util.Arrays;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.elf.warehouse.beans.ItemBean;
import com.techchefs.elf.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class AddItem {
	
	public static void main(String[] args) {
		
//		Configuration cfg =  new Configuration();
//		cfg.configure();
//		cfg.addAnnotatedClass(ItemBean.class);		
//		SessionFactory sessionFactory = cfg.buildSessionFactory();		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		
		ItemBean bean = new ItemBean();
		
		bean.setId(3);
		bean.setName("Iphone");
		bean.setDesc("10R");
		bean.setQuantity(250);
		bean.setCost(79999);
		
		Transaction txn = null;
		try (Session session = factory.openSession()) {
			
			txn = session.beginTransaction();			
			session.save(bean);			
			txn.commit();		
			
		} catch (PersistenceException pe) {
			if(txn !=null)
				txn.rollback();
			
			log.info(Arrays.asList(pe.getStackTrace()).toString());
			
		}
	}

}
