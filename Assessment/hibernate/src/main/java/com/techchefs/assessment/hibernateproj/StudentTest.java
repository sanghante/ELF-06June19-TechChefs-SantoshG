package com.techchefs.assessment.hibernateproj;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.techchefs.assessment.hibernateproj.dto.Student;
import com.techchefs.assessment.hibernateproj.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudentTest {

	public static void main(String[] args) {
		
		
		try (Session session = HibernateUtil.getSession()) {
			Criteria criteria =  session.createCriteria(Student.class);
			List<Student> list = criteria.list();
			
			list.forEach(e -> log.info(""+e.getFirstName() + e.getTotalMarks()));
		}
		
	}
}
