package com.techchefs.hibernateapp.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

public class GetWithRestrictions {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		((AbstractApplicationContext)ctx).registerShutdownHook();
		
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		
		 
		
		/*
		 * With list
		 * Criterion criterion = Restrictions.eq("id", 30);
		 * criteria.add(criterion); 
		 * List<EmployeeInfoBean> list = criteria.list(); for (EmployeeInfoBean
		 * employeeInfoBean : list) { System.out.println(employeeInfoBean.toString()); }
		 */		
		
		
		//EmployeeInfoBean emp = (EmployeeInfoBean) criteria.uniqueResult();
		//System.out.println(emp);
		
		
		criteria.add(Restrictions.gt("salary", 1000.0))
				.add(Restrictions.eq("gender", "M"))
				.add(Restrictions.ilike("designation", "Developer"));
				
		List<EmployeeInfoBean> list = criteria.list(); 
		for (EmployeeInfoBean employeeInfoBean : list) {
			System.out.println(employeeInfoBean.toString()); 
		}
		
		
		
	}

}
