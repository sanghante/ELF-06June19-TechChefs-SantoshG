package com.techchefs.hibernateapp.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil2;

public class GetWithRestrictions {

	public static void main(String[] args) {

		Session session = HibernateUtil2.getSessionFactory().openSession(); 
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
