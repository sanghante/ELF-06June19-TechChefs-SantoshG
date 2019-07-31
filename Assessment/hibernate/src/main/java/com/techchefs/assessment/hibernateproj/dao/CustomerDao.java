package com.techchefs.assessment.hibernateproj.dao;

import com.techchefs.assessment.hibernateproj.dto.Customer;

public interface CustomerDao {
	
	void insertCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);	
	Customer getCustomer(int id);
}
