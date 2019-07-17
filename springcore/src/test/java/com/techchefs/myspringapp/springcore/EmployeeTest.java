package com.techchefs.myspringapp.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.myspringapp.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
				
		EmployeeBean emp1 = (EmployeeBean)ctx.getBean("employeeBean");
		EmployeeBean emp2 = (EmployeeBean)ctx.getBean("employee");
		
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the name of the new employee"); String name =
		  sc.nextLine();
		  
		  System.out.println("Enter the id of the new employee"); int id =
		  sc.nextInt();
		  
		  EmployeeBean emp3 = (EmployeeBean) ctx.getBean("employee");
		  emp3.setName(name); emp3.setId(id);
		 

		log.info("Employee 1");
		log.info("Employee name is : "+emp1.getName());
		log.info("Employee Id is : "+emp1.getId());
		
		
		log.info("Employee dept id is : "+emp1.getDept().getDeptId());
		log.info("Employee dept name is : "+emp1.getDept().getDeptName());
		
		  log.info("Employee 2"); log.info("Employee name is : "+emp2.getName());
		  log.info("Employee Id is : "+emp2.getId()); log.info("Employee 3");
		 
		((ClassPathXmlApplicationContext)ctx).close();
		
		  log.info("Employee name is : "+emp3.getName());
		  log.info("Employee Id is : "+emp3.getId());
		 		
		Thread.sleep(2000);
		
		
		
	}

}
