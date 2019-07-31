package com.techchefs.assessment.hibernateproj;

import com.techchefs.assessment.hibernateproj.dao.CustomerDao;
import com.techchefs.assessment.hibernateproj.dao.CustomerDaoHibernateImpl;

public class DeleteRecord {

	public static void main(String[] args) {
		
		CustomerDao dao = new CustomerDaoHibernateImpl();
		dao.deleteCustomer(1);
		
	}
}
