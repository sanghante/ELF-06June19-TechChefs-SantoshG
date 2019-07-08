package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernateapp.util.HibernateUtil2;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {

	public static void main(String[] args) {
		
		Session session = HibernateUtil2.getSessionFactory().openSession();
		//String hql = "Delete from EmployeeInfoBean where id = 24";
		String hql = "Delete from EmployeeInfoBean where id = :eid";
		Query query = session.createQuery(hql);
		query.setParameter("eid", 28);
		Transaction txn = null;
		try {
			txn = session.beginTransaction();
			int res = query.executeUpdate();
			log.info("Deleted : "+res+" rows");
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
