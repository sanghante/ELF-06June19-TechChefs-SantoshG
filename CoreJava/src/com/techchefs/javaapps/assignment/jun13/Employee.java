/**
 * 
 */
package com.techchefs.javaapps.assignment.jun13;

/**
 * @author Administrator
 *
 */
public final class Employee {

	private final String name;
	private final int age;
	private final String gender;
	private final double salary;
	private final boolean active;
	
	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param salary
	 * @param status
	 */
	public Employee(String name, int age, String gender, double salary, boolean status) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.active = status;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isActive() {
		return active;
	}
	
}
