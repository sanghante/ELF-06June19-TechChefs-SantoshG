package com.techchefs.myspringapp.springcore.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.techchefs.myspringapp.springcore.beans.DepartmentBean;

@Configuration
public class DeptConfig {
	
	@Bean(name = {"hr","hrd"})
	public DepartmentBean getDepartmentBeanHR() {
		DepartmentBean depts = new DepartmentBean();
		depts.setDeptId(200);
		depts.setDeptName("HR");
		return depts;
	}
	
	@Bean
	//@Primary
	public DepartmentBean getDepartmentBeanAdmin() {
		DepartmentBean dept = new DepartmentBean();
		dept.setDeptId(300);
		dept.setDeptName("Admin");
		return dept;
	}

}
