package com.techchefs.assessment.hibernateproj;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.techchefs.assessment.hibernateproj.dto.Student;
import com.techchefs.assessment.hibernateproj.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudentAggregate {

	public static void main(String[] args) {
		
		String hql1  = " select min(totalMarks) from Student";
		String hql2 = "select max(totalMarks) from Student";
		String hql3 = "Select avg(totalMarks) from Student";
		
		try (Session session = HibernateUtil.getSession()) {
			Query query = session.createQuery(hql1);
			String result1 = (String)query.getSingleResult();
			
			log.info("Students Min marks");
			log.info(result1);
			
			query = session.createQuery(hql2);
			String result2 = (String)query.getSingleResult();
			
			log.info("Students Max marks");
			log.info(result2);

			
			query = session.createQuery(hql3);
			String result3= (String)query.getSingleResult();
			
			log.info("Students Avg marks");
			log.info(result3);

			
		}
	}
}
