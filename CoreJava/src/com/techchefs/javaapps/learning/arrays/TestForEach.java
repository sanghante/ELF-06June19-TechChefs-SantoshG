package com.techchefs.javaapps.learning.arrays;

import java.util.Arrays;

public class TestForEach {

	public static void main(String[] args) {

		String []atr = new String[] {"a", "b", "c"};
		
		for(String a: atr) {
			System.out.println(a);
		}
		
		
		Employee emp[] = new Employee[4];
		
		Employee temp_emp = new Employee("mahadev", 1, 'M');		
		emp[3] = temp_emp;
		
		temp_emp = new Employee("shiva", 2, 'M');
		emp[2] = temp_emp;
		
		temp_emp = new Employee("rudra", 3, 'M');
		emp[1] = temp_emp;
		
		temp_emp = new Employee("bholenath", 4, 'M');
		emp[0] = temp_emp;
		
		Arrays.sort(emp);
		
		
		for(Employee e1 : emp) {
			System.out.println(e1.toString());
		}
		
	}

}
