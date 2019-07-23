package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		((AbstractApplicationContext)ctx).registerShutdownHook();

		//String hql = "Delete from EmployeeInfoBean where id = 24";
		String hql = "Delete from EmployeeInfoBean where id = :eid";
		
		Transaction txn = null;
		try (Session session = factory.openSession()){
			Query query = session.createQuery(hql);
			query.setParameter("eid", 320);
			txn = session.beginTransaction();
			int res = query.executeUpdate();
			log.info("Deleted : "+res+" rows");
			txn.commit();
		} catch (Exception e) {
			log.severe(e.getMessage());
			if (txn != null)
				txn.rollback();
		} finally {
			((AbstractApplicationContext)ctx).close();			
		}

	}

}
