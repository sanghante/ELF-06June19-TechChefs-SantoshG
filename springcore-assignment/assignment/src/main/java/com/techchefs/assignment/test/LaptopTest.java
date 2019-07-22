package com.techchefs.assignment.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.assignment.config.LaptopConfig;
import com.techchefs.assignment.interfaces.Laptop;

import lombok.extern.java.Log;

@Log
public class LaptopTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("laptopConfig.xml");
		Laptop lappy = (Laptop)context.getBean("hp");
		
		log.info("hi");
		
		lappy.showSpecification();
		
		
	}//End of main

}//End of class
