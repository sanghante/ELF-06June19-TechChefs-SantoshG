package com.techchefs.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {
	
	@Bean("jdbc")
	public EmployeeDAO getJDBCInstance() {
		return new EmployeeDAOHibernateImpl();
	}
	
	@Bean("hibernate")
	public EmployeeDAO getHibernateInstance() {
		return new EmployeeDAOHibernateImpl();
	}

}
