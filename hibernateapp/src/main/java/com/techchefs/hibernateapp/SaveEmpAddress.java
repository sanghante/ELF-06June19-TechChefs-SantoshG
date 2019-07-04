package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeAddressInfoBean;

import lombok.extern.java.Log;

@Log
public class SaveEmpAddress {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		EmployeeAddressInfoBean addressInfoBean = new EmployeeAddressInfoBean();
		
		addressInfoBean.setAddress1("Sri Ramanjaneya Road, 4th cross");
		addressInfoBean.setAddress2("Hanumanthnagar, Bangalore South");
		addressInfoBean.setAddressType("Present");
		addressInfoBean.setCity("Bangalore");
		addressInfoBean.setCountry("India");
		addressInfoBean.setId(21);
		addressInfoBean.setLandmark("Near Ramajaneya temple");
		addressInfoBean.setPincode(600071);
		addressInfoBean.setState("Karnataka");
		
		Transaction tnx = session.beginTransaction();
		session.save(addressInfoBean);
		tnx.commit();
		session.close();
		
		
	}
}
