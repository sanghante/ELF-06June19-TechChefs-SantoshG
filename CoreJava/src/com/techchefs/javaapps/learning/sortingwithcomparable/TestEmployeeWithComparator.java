package com.techchefs.javaapps.learning.sortingwithcomparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployeeWithComparator {

	public static void main(String[] args) {
		
		Comparator<Employee> comparator = null;
		
		//comparator = new EmployeeByID();
		//comparator = new EmployeeByName();
		//comparator = new EmployeeBySalary();
		
		comparator = (e1, e2) -> {
			if (e1.getId() > e2.getId()) 
				return 1;
			else if (e1.getId() < e2.getId())
				return -1;
			else 
				return 0;
		};
		
		comparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
		
		Set<Employee> set = new TreeSet<Employee>(comparator);
		
		set.add(new Employee("Amit", 2, 15000));
		set.add(new Employee("Deepa", 1, 25000));
		set.add(new Employee("Simran", 3, 5000));
		set.add(new Employee("Raju", 5, 9000));
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
		
		
	}
}
