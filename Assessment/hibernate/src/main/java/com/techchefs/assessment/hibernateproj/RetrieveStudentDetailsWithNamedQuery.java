package com.techchefs.assessment.hibernateproj;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.techchefs.assessment.hibernateproj.dto.Student;
import com.techchefs.assessment.hibernateproj.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class RetrieveStudentDetailsWithNamedQuery {

	public static void main(String[] args) {
		
		String sql = "from Student where rollNum =:erollNum and subject=esubject";
		
		try (Session session = HibernateUtil.getSession()) {
			Query<Student> query = session.createNamedQuery(sql);
			query.setParameter("erollNum", 10);
			query.setParameter("esubject", "English");
			List<Student> list = query.getResultList();
			
			list.forEach(e -> log.info(e.toString()));
		}
		
	}
}
