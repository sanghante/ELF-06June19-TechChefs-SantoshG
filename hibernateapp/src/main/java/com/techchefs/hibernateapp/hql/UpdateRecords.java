package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernateapp.util.HibernateUtil2;

import lombok.extern.java.Log;

@Log
public class UpdateRecords {

	public static void main(String[] args) {
		
		Session session = HibernateUtil2.getSessionFactory().openSession();
		//String hql = "update EmployeeInfoBean set name = 'Ramprasad' where name like '%Piyush'";
		String hql = "update EmployeeInfoBean set name = :ename where name like :ecurrentname";
		Query query = session.createQuery(hql);
		query.setParameter("ename", "Shiva Prakash");
		query.setParameter("ecurrentname", "%Ramprasad");
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
