package com.techchefs.javaapps.assignment.five;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployeeWithComparator {

	public static void main(String[] args) {

		Comparator<Employee> comparator = null;

		int intComparatorFlag = 3;

		switch (intComparatorFlag) {

		case 1:
			comparator = new EmployeeByID();
			break;

		case 2:
			comparator = new EmployeeByName();
			break;

		case 3:
			comparator = new EmployeeBySalary();
			break;

		default:
			System.out.println("Wrong choice");
			break;
		}

		Set<Employee> set = new TreeSet<>(comparator);

		set.add(new Employee("Amit", 2, 15000));
		set.add(new Employee("Deepa", 1, 25000));
		set.add(new Employee("Simran", 3, 5000));
		set.add(new Employee("Raju", 5, 9000));

		for (Employee employee : set) {
			System.out.println(employee);
		}

	}
}
