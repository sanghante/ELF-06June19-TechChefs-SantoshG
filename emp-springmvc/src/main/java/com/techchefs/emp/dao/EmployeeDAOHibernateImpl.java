/**
 * 
 */
package com.techchefs.emp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.util.HibernateUtil;

import lombok.extern.java.Log;

/**
 * @author Administrator
 *
 */

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	//@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException nfe) {
			log.severe("Exception occured while trying to convert parameter id to Integer. id = " + id);
			log.severe(nfe.getMessage());
			return null;
		}
	}

	//@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {

		EmployeeInfoBean infoBean = null;
		try (Session session = sessionFactory.openSession();) {
			infoBean = session.get(EmployeeInfoBean.class, id);
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return infoBean;
	}

	//@Override
	public EmployeeInfoBean readmployeeInfo(String id) {
		return getEmployeeInfo(id);
	}

	//@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo(String id) {

		String hql1 = " From EmployeeInfoBean where str(id) like '"+id+"%'";
		List<EmployeeInfoBean> list = null;
		try (Session session = sessionFactory.openSession();) {
			Query<EmployeeInfoBean> query = session.createQuery(hql1);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<EmployeeInfoBean>(list);
		
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try (Session session = sessionFactory.openSession();) { 
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

	//@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	//@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	//@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

	//@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		try (Session session = sessionFactory.openSession();) {
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
