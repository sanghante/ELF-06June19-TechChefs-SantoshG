package com.techchefs.hibernateapp.hql;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class GetViaSP {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		((AbstractApplicationContext)ctx).registerShutdownHook();
		
		Session session = factory.openSession();
		
		StoredProcedureQuery query = session.createStoredProcedureCall("GetEmpWithID").registerStoredProcedureParameter("idin", Integer.class, ParameterMode.IN);
				query.setParameter("idin", 30);
		List<Object> ku =  query.getResultList();
		
		System.out.println(ku.size());
		System.out.println(ku.get(0).getClass());

	}

}
