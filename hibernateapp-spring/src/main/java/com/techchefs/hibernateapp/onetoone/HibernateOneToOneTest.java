package com.techchefs.hibernateapp.onetoone;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.hibernateapp.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {
	public static void main(String[] args){
		//Prepare the data
		int id = 320;
		EmployeeInfoBean data = PrepareDataUtil.prepareData(id);
		save(data);
		
	}//End of main
	
	private static void save(EmployeeInfoBean data) {
		Transaction transaction=null;
		
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		((AbstractApplicationContext)ctx).registerShutdownHook();
		
		try(Session session = factory.openSession()){
			 transaction = session.beginTransaction();
			 session.save(data);
			 transaction.commit();
		}catch (Exception e) {
			log.info(Arrays.toString(e.getStackTrace()));
			if(transaction!=null) {
				transaction.rollback();
			}
		}finally {
			((AbstractApplicationContext)ctx).close();
		}
		
		
	}

}//End of class
