package com.techchefs.hibernateapp.hql;

import java.util.List;
import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil2;

import lombok.extern.java.Log;

@Log
public class ReadEmployeesDemo {

	public static void main(String[] args) {

		Session session = HibernateUtil2.getSessionFactory().openSession();
		String hql1 = " From EmployeeInfoBean e";
		String hql2 = " From EmployeeInfoBean e where e.name = 'Radhika'";
		String hql3 = " Select distinct name from EmployeeInfoBean";
		String hql4 = " Select count(distinct name) from EmployeeInfoBean";
		
		Query<EmployeeInfoBean> query = session.createQuery(hql1);
		
		/*
		 * Stream<EmployeeInfoBean> eStream = query.getResultStream(); eStream.forEach(
		 * e -> log.info(e.toString()));
		 */
		
		List<EmployeeInfoBean> list = query.list();
		log.info("Retrieved total "+list.size()+" employees from the DB");		
		list.forEach(ReadEmployeesDemo::printEmployeeInfo);
		
		Query<String> nameQuery = session.createQuery(hql3);
		List<String> sList = nameQuery.list();
		sList.forEach( a -> log.info(a));
		
		Query distinctNameQuery = session.createQuery(hql4);
		List<String> count = distinctNameQuery.list();
		log.info(""+count.size());
	}
	
	
	private static void printEmployeeInfo(EmployeeInfoBean bean) {
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
	

}
