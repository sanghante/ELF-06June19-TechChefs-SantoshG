package com.techchefs.assessment.hibernateproj;

import com.techchefs.assessment.hibernateproj.dao.CustomerDao;
import com.techchefs.assessment.hibernateproj.dao.CustomerDaoHibernateImpl;
import com.techchefs.assessment.hibernateproj.dto.Customer;

public class SaveCustomerRecord {

	public static void main(String[] args) {
		
		CustomerDao dao = new CustomerDaoHibernateImpl();
		
		Customer customer = new Customer();
		
		customer.setId(3);
		customer.setFirstName("Rahul");
		customer.setLastName("Bhayya");
		customer.setAddress("no. 420, 1st main road, Pichli gali");
		customer.setCity("Patna");
		customer.setState("Bihar");
		customer.setCountry("India");
		customer.setContactNumber(45875478);
		
		dao.insertCustomer(customer);
	}
}
