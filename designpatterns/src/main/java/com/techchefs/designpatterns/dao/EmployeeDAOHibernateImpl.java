/**
 * 
 */
package com.techchefs.designpatterns.dao;

import java.io.File;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.designpatterns.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

/**
 * @author Administrator
 *
 */

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException nfe) {
			log.severe("Exception occured while trying to convert parameter id to Integer. id = "+id);
			log.severe(nfe.getMessage());
			return null;
		}
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		
		//step 1.
		Configuration cfg = new Configuration();
		//cfg.configure("MyHibernate.cfg.xml");
		//cfg.configure();
		cfg.configure( new File("D:\\MyHibernate.cfg.xml"));
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		//step 2. 
		SessionFactory factory = cfg.buildSessionFactory();
		//step 3.
		Session session = factory.openSession();
		
		//step 4.
		EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, 21);
		log.info(infoBean.toString());
		//step 5.
		session.close();
		return infoBean;
	}

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		return null;
	}

}
