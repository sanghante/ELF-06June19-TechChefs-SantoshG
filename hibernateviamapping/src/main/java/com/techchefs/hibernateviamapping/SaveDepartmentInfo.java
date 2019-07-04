package com.techchefs.hibernateviamapping;

import org.hibernate.Transaction;

import org.hibernate.Session;

import com.techchefs.hibernateapp.dto.EmployeeDepartmentInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil2;

public class SaveDepartmentInfo {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil2.getSessionFactory().openSession();
		Transaction tnx = session.beginTransaction();
		
		EmployeeDepartmentInfoBean deptBean = new EmployeeDepartmentInfoBean();
		deptBean.setDeptId(50);
		deptBean.setDeptName("Security");
		session.save(deptBean);
		tnx.commit();
		session.close();
		
	}

}
