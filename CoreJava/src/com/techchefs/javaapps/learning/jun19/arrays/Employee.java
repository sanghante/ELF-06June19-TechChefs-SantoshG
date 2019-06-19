package com.techchefs.javaapps.learning.jun19.arrays;

public class Employee implements Comparable<Employee>{

	private String name;
	private int employee_id;
	private char gender;
	
	Employee(String n, int id, char g) {
		this.name = n;
		this.employee_id = id;
		this.gender = g;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employee_id=" + employee_id + ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Employee o) {

		if (this.employee_id > o.employee_id) 
			return 1;
		
		return 0;
	}
}
