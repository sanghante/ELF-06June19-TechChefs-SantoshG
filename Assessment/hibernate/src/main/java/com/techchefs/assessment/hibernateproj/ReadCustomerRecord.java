package com.techchefs.assessment.hibernateproj;

import com.techchefs.assessment.hibernateproj.dao.CustomerDao;
import com.techchefs.assessment.hibernateproj.dao.CustomerDaoHibernateImpl;
import com.techchefs.assessment.hibernateproj.dto.Customer;

import lombok.extern.java.Log;

@Log
public class ReadCustomerRecord {

	public static void main(String[] args) {
		
		CustomerDao dao = new CustomerDaoHibernateImpl();
		Customer customer = dao.getCustomer(1);
		
		if (customer != null) {
			log.info("customer retrieved from dB, info below");
			log.info(customer.toString());
		}
	}
}
