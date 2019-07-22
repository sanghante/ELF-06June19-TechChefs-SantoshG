package com.techchefs.hibernateapp.onetoone;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {
	public static void main(String[] args){
		//Prepare the data
		int id = 300;
		EmployeeInfoBean data = PrepareDataUtil.prepareData(id);
		save(data);
		
	}//End of main
	
	private static void save(EmployeeInfoBean data) {
		Transaction transaction=null;	
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			 transaction = session.beginTransaction();
			 session.save(data);
			 transaction.commit();
		}catch (Exception e) {
			log.info(Arrays.toString(e.getStackTrace()));
			if(transaction!=null) {
				transaction.rollback();
			}
		}//End of catch
	}

}//End of class
