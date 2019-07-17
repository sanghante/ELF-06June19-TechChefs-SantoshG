package com.techchefs.myspringapp.springcore.configs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.techchefs.myspringapp.springcore.beans.EmployeeBean;

@Configuration
@Import(DeptConfig.class)
public class EmpConfig {
	
	@Bean	
	public EmployeeBean getEmployeeBean() {
		EmployeeBean bean = new EmployeeBean();
		bean.setId(101);
		bean.setName("Ramesh");
		return bean;
	}

}
