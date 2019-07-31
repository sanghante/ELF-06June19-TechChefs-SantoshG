package com.techchefs.assessment.hibernateproj;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.assessment.hibernateproj.dto.Student;
import com.techchefs.assessment.hibernateproj.util.HibernateUtil;

public class CopyCustomerTableData {

	public static void main(String[] args) {
		
		String hql = " insert into Test select id, firstName, lastName, subject, totalMarks from Customer";
		Transaction txn = null;
		try (Session session = HibernateUtil.getSession()) {
			Query<Student> query = session.createQuery(hql);
			
			txn = session.beginTransaction();
			query.executeUpdate();
			txn.commit();
			
			
		}catch (Exception e) {
			if(txn != null) {
				txn.rollback();
			}
		}

	}
}
