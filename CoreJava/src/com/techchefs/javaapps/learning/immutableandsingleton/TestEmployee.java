package com.techchefs.javaapps.learning.immutableandsingleton;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Ramesha", 24, "M",500000,true);
		
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getGender());
		System.out.println(employee.getSalary());
		System.out.println(employee.isActive());
	}

}
