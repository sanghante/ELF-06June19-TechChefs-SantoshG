/**
 * 
 */
package com.techchefs.designpatterns.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
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
		cfg.configure();
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

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeInfoBean readmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
