package com.techchefs.hibernateapp.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil2;

public class GetWithProjections {

	public static void main(String[] args) {

		Session session = HibernateUtil2.getSessionFactory().openSession(); 
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		
		/*
		 * Projection proj = Projections.property("name"); criteria.setProjection(proj);
		 * 
		 * 
		 * List<String> list = criteria.list(); for (String ename : list) {
		 * System.out.println(ename); }
		 */		
		
		
		criteria.setProjection(Projections.projectionList()
															.add(Projections.property("name"))
															.add(Projections.property("email"))
															.add(Projections.property("age")));

		List<Object[]> list = criteria.list(); 
		
		for (Object[] result : list) {
			for( Object insideRes : result) {
				System.out.print(insideRes.toString());
				System.out.print("--");
			}
			System.out.println();
		}
		
		
	}

}
