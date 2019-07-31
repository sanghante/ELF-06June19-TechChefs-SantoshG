package com.techchefs.assessment.hibernateproj;

import com.techchefs.assessment.hibernateproj.dao.CustomerDao;
import com.techchefs.assessment.hibernateproj.dao.CustomerDaoHibernateImpl;
import com.techchefs.assessment.hibernateproj.dto.Customer;

public class UpdateCustomer {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDaoHibernateImpl();
		Customer customer = dao.getCustomer(1);
		
		if (customer != null) {
			customer.setLastName("DeshPremi");
			dao.updateCustomer(customer);
		}
	}
}
