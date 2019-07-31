package com.techchefs.assessment.hibernateproj.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.assessment.hibernateproj.dto.Customer;
import com.techchefs.assessment.hibernateproj.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CustomerDaoHibernateImpl implements CustomerDao {

	public void insertCustomer(Customer customer) {
		
		Transaction txn = null;
		try (Session session =  HibernateUtil.getSession();){
			txn = session.beginTransaction();
			session.save(customer);
			txn.commit();
			log.info("inserted customer into the DB");
		} catch (Exception e) {
			if (txn != null)
				txn.rollback();
			e.printStackTrace();
		}
	}

	public void updateCustomer(Customer customer) {
		Transaction txn = null;
		try (Session session =  HibernateUtil.getSession();){
			txn = session.beginTransaction();
			session.saveOrUpdate(customer);
			txn.commit();
			log.info("updated customer in the DB");
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}
	}

	public void deleteCustomer(int id) {
		Transaction txn = null;
		try (Session session =  HibernateUtil.getSession();){
			
			Customer customer = session.get(Customer.class, id);
			
			txn = session.beginTransaction();
			session.delete(customer);
			txn.commit();
			log.info("deleted customer from the DB");
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}
	}

	public Customer getCustomer(int id) {
		Customer customer = null;
		try (Session session = HibernateUtil.getSession();) {
			customer = session.get(Customer.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return customer;
	}

}
