package com.techchefs.hibernateapp.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil2;

import lombok.extern.java.Log;

@Log
public class GetAllDetailsUsingCriteria {

	public static void main(String[] args) {
		
		Session session = HibernateUtil2.getSessionFactory().openSession();
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
