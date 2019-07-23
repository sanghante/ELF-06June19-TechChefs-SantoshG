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
public class UpdateRecords2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		((AbstractApplicationContext)ctx).registerShutdownHook();
		
		Session session = factory.openSession();
		
		//String hql = "update EmployeeInfoBean set name = 'Ramprasad' where name like '%Piyush'";
		String hql = "update EmployeeInfoBean set name = '"+args[0]+"' where name like '"+args[1]+"'";
		Query query = session.createQuery(hql);
		//query.setParameter("ename", args[0]);
		//query.setParameter("ecurrentname", args[1]);
		Transaction txn = null;
		try {
			txn = session.beginTransaction();
			int res = query.executeUpdate();
			log.info("Updated : "+res+" rows");
			txn.commit();
		} catch (Exception e) {
			log.severe(e.getMessage());
			if (txn != null)
				txn.rollback();
		} finally {
			session.close();			
		}

	}

}
