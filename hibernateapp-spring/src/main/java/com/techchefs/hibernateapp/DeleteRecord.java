package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.extern.java.Log;

import org.hibernate.Transaction;

@Log
public class DeleteRecord {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		((AbstractApplicationContext)ctx).registerShutdownHook();

		Session session = factory.openSession();
		
		Transaction tnx = session.beginTransaction();
		
		EmployeeInfoBean employeeInfoBean = session.get(EmployeeInfoBean.class, 320);
		
		log.info(employeeInfoBean.toString());
		
		session.delete(employeeInfoBean);
		tnx.commit();
		session.close();

	}

}
