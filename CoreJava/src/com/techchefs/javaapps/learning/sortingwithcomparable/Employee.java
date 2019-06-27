package com.techchefs.javaapps.learning.sortingwithcomparable;

import java.util.Comparator;

public class Employee {
	
	private String name;
	private int id;
	private double salary;
	
	Employee(String nm, int id, double sal) {
		this.name = nm;
		this.id = id;
		this.salary = sal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
}

/*
class EmployeeByID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Integer i = o1.getId();
		return i.compareTo(o2.getId());
	}
	
}

class EmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Double sal = o1.getSalary();
		return sal.compareTo(o2.getSalary());
	}
	
}

class EmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String name = o1.getName();
		return name.compareTo(o2.getName());
	}
	
}*/