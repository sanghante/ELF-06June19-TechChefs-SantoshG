package com.techchefs.assessment.hibernateproj;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.techchefs.assessment.hibernateproj.dto.Student;
import com.techchefs.assessment.hibernateproj.util.HibernateUtil;

/*
 * Question 8. Create a store Procedure on student table and write a program to call the same stored Procedure using hibernate.
 */

public class StoredProcedureViaHibernate {

	public static void main(String[] args) {
		
		String sql = "from Student where rollNum =:erollNum and subject=esubject";
		
		try (Session session = HibernateUtil.getSession()) {
			StoredProcedureQuery query = session.createStoredProcedureCall("GetStudentsWithID")
										.registerStoredProcedureParameter("inputId",Integer.class ,ParameterMode.IN );
			
			List<Student> list = query.getResultList();
		}
	}
	

}
