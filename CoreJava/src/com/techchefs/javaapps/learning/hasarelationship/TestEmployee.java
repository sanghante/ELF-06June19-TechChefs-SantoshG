package com.techchefs.javaapps.learning.hasarelationship;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEmployee_id(1);
		employee.setName("Gunda");
		employee.setGender('M');
		
		System.out.println(employee.getEmployee_id());
		System.out.println(employee.getName());
		System.out.println(employee.getGender());
				
	}
}
