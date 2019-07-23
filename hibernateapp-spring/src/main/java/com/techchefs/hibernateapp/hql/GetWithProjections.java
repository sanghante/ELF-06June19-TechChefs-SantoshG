package com.techchefs.hibernateapp.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

public class GetWithProjections {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		((AbstractApplicationContext)ctx).registerShutdownHook();
		
		Session session = factory.openSession();
		
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
