package com.techchefs.hibernateapp;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import com.techchefs.hibernateapp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;

@Log
public class SaveEmployeeOtherInfo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		try (SessionFactory factory = cfg.buildSessionFactory();
				Session session = factory.openSession();) {
			
			//cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);

			EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();

			otherInfoBean.setAadhar(111222333);
			otherInfoBean.setBloodGrp("A+ve");
			otherInfoBean.setEmergencyContactName("Ramaiah Vastavayya");
			otherInfoBean.setEmergencyContactNumber(123456789);
			otherInfoBean.setFatherName("Deve Gowda");
			otherInfoBean.setId(21);
			otherInfoBean.setIsmarried(true);
			otherInfoBean.setMotherName("Sannamma");
			otherInfoBean.setNationality("Sri Lankan");
			otherInfoBean.setPan("APJG123490P");
			otherInfoBean.setPassport("M89124I");
			otherInfoBean.setReligion("Buddist");
			
			Transaction transaction = session.beginTransaction();
			session.save(otherInfoBean);
			transaction.commit();
			session.close();
			
		} catch (PersistenceException pe) {
			log.severe("From Catch"+pe.getMessage());
		}

	}
}
