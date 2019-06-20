package com.techchefs.javaapps.learning.jun20.sortingwithcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestGenericArrayList {

	public static void main(String[] args) {

		List<Student> aL = new ArrayList<>();

		aL.add(new Student("Soma", 3, 87.2));
		aL.add(new Student("Bhima", 2, 91.2));
		aL.add(new Student("Chandra", 5, 83.2));
		aL.add(new Student("Surya", 6, 79.2));
		aL.add(new Student("Rama", 1, 89.2));
		aL.add(new Student("Krishna", 4, 81.2));

		System.out.println("Here are the students in the list :");
		for (Student student : aL) {
			System.out.println(student.toString());
		}

		System.out.println("Student List displayed using iterator");
		for (Iterator<Student> iterator = aL.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}

		System.out.println("Student List displayed using list iterator");
		for (ListIterator<Student> iterator = aL.listIterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}

		Comparator<Student> byPercentage = (a, b) -> {

			if (a.getPercentage() > b.getPercentage())
				return 1;
			else if (a.getPercentage() < b.getPercentage())
				return -1;
			else
				return 0;

		};
		
		
		Comparator<Student> byID = (a, b) -> {
			
			if (a.getId() > b.getId())
				return 1;
			if (a.getId() < b.getId())
				return -1;
			else
				return 0;
		};
		
		Comparator<Student> byName = (a, b) -> a.getName().compareTo(b.getName());

		aL.sort(byPercentage);

		System.out.println("Here are the students sorted by percentage :");
		for (Student student : aL) {
			System.out.println(student.toString());
		}
		
		aL.sort(byID);
		System.out.println("Here are the students sorted by ID :");
		for (Student student : aL) {
			System.out.println(student.toString());
		}
		
		aL.sort(byName);
		System.out.println("Here are the students sorted by Name :");
		for (Student student : aL) {
			System.out.println(student.toString());
		}

		aL.sort(aL.get(0));
		System.out.println("Here are the students sorted by ID using internal implementation of Comparator:");
		for (Student student : aL) {
			System.out.println(student.toString());
		}
		
		
		System.out.println("Here are the students sorted using Collections.sort()");
		Collections.sort(aL);
		for (Student student : aL) {
			System.out.println(student.toString());
		}
		
	}

}
