package com.techchefs.myspringapp.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class EmployeeBean  implements InitializingBean,DisposableBean {
	
	private String name;
	private int id;
	
	@Autowired
	@Qualifier("hrd")
	private DepartmentBean dept;
		
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy phase");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization phase");
	}
	/**
	 * @param name
	 * @param id
	 * @param dept
	 */
	/*
	 * public EmployeeBean(String name, int id, DepartmentBean dept) { super();
	 * this.name = name; this.id = id; this.dept = dept; }
	 */
}
