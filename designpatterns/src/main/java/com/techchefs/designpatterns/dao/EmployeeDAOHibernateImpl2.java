/**
 * 
 */
package com.techchefs.designpatterns.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.designpatterns.dto.EmployeeInfoBean;
import com.techchefs.designpatterns.util.HibernateUtil;

import lombok.extern.java.Log;

/**
 * @author Administrator
 *
 */

@Log
public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException nfe) {
			log.severe("Exception occured while trying to convert parameter id to Integer. id = " + id);
			log.severe(nfe.getMessage());
			return null;
		}
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {

		Session session = HibernateUtil.getSession();
		EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, 21);
		session.close();

		return infoBean;
	}

	@Override
	public EmployeeInfoBean readmployeeInfo(String id) {
		return getEmployeeInfo(id);
	}

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = HibernateUtil.getSession();
		
		Query<EmployeeInfoBean> query = session.createQuery(" from EmployeeInfoBean");
		ArrayList<EmployeeInfoBean> list = (ArrayList<EmployeeInfoBean>) query.getResultList();
		
		session.close();
		return list;

		
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = HibernateUtil.getSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		try {
			Session session = HibernateUtil.getSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

}
