package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernateapp.util.HibernateUtil2;

import lombok.extern.java.Log;

@Log
public class InsertIntoNewDemo {

	public static void main(String[] args) {
		
		Session session = HibernateUtil2.getSessionFactory().openSession();
		String hql = "insert into EmployeeNewInfo(id, name, email) select id, name, email from EmployeeInfoBean where id = 30" ;
		Query query = session.createQuery(hql);

		//query.setParameter("ename", args[0]);
		//query.setParameter("ecurrentname", args[1]);
		
		Transaction txn = null;
		try {
			txn = session.beginTransaction();
			int res = query.executeUpdate();
			log.info("Inserted : "+res+" rows");
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
