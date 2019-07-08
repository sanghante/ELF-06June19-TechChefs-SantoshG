package com.techchefs.hibernateapp.hql;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil2;

import lombok.extern.java.Log;

@Log
public class GetViaSP {

	public static void main(String[] args) {
		
		Session session = HibernateUtil2.getSessionFactory().openSession();
		
		StoredProcedureQuery query = session.createStoredProcedureCall("GetEmpWithID").registerStoredProcedureParameter("idin", Integer.class, ParameterMode.IN);
				query.setParameter("idin", 30);
		List<Object> ku =  query.getResultList();
		
		System.out.println(ku.size());
		System.out.println(ku.get(0).getClass());

	}

}
