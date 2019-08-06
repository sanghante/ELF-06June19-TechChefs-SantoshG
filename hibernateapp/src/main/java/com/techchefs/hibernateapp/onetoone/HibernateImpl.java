package com.techchefs.hibernateapp.onetoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.manytomany.TrainingInfoBean;
import com.techchefs.hibernateapp.manytoone.DepartmentInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeEducationInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeExperienceInfoBean;

public class HibernateImpl {
	
	private Configuration config = new Configuration();
	
	private SessionFactory factory = config
			.configure()
			.buildSessionFactory();
	
	
	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean, 
			List<EmployeeAddressInfoBean> addressInfoBeans, List<EmployeeEducationInfoBean> educationInfoBeans, 
			List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(infoBean);
		session.save(otherInfoBean);
		//session.save(addressInfoBean);
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBeans) {
			session.save(employeeAddressInfoBean);
		} 
		
		for (EmployeeEducationInfoBean employeeEducationInfoBean : educationInfoBeans) {
			session.save(employeeEducationInfoBean);
		}
		
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : experienceInfoBeans) {
			session.save(employeeExperienceInfoBean);
		}
		txn.commit();
		session.close();
	
	}//end of createEmployee
	
	public void createTrainingInfo(TrainingInfoBean trainingInfoBean) {
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();		
		session.save(trainingInfoBean);		
		txn.commit();
		session.close();

	}
	
	public void createEmployee(EmployeeInfoBean infoBean) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();		
		session.saveOrUpdate(infoBean);		
		txn.commit();
		session.close();
		
	}
	
	public EmployeeInfoBean getEmployeeInfoBean(int id) {
		Session session = factory.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);		
		session.close();
		return bean;
	}
	
	public void createDepartment(DepartmentInfoBean deptBean) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();		
		session.save(deptBean);		
		txn.commit();
		session.close();
	}
	
	
}//end of HibernateImpl
