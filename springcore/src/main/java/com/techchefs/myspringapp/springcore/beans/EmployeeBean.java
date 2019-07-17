package com.techchefs.myspringapp.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class EmployeeBean  implements InitializingBean,DisposableBean {
	
	private String name;
	private int id;
	private DepartmentBean dept;
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy phase");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization phase");
	}
}
