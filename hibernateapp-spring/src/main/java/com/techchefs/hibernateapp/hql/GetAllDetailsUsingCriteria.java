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

import lombok.extern.java.Log;

@Log
public class GetAllDetailsUsingCriteria {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		((AbstractApplicationContext)ctx).registerShutdownHook();
		
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> list = criteria.list();
		
		for (EmployeeInfoBean bean : list) {
			log.info("Retrieved Employee Info from DAO");
			log.info("Designation : "+bean.getDesignation());
			log.info("ID : "+bean.getId());
			log.info("Name : "+bean.getName());
			log.info("Age : "+bean.getAge());
			log.info("Manager ID : "+bean.getManagerId());
			log.info("Department ID : "+bean.getDepartmentId());
			log.info("Salary : "+bean.getSalary());
			log.info("DOB : "+bean.getDob());
			log.info("Email : "+bean.getEmail());
			log.info("Gender : "+bean.getGender());
			log.info("Joining date : "+bean.getJoiningDate());
			log.info("Account number : "+bean.getAccountNumber());
			log.info("Phone number : "+bean.getPhoneNumber());

		}

		session.close();
	}

}
