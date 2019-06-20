package com.techchefs.javaapps.learning.jun20.sortingwithcomparable;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		Set<Student> treeSet = new TreeSet<Student>();

		treeSet.add(new Student("Soma", 3, 87.2));
		treeSet.add(new Student("Bhima", 2, 91.2));	
		treeSet.add(new Student("Chandra", 5, 83.2));				
		treeSet.add(new Student("Surya", 6, 79.2));
		treeSet.add(new Student("Rama", 1, 89.2));
		treeSet.add(new Student("Krishna", 4, 81.2));
		
		for (Student student : treeSet) {
			System.out.println(student);
		}

	}

}
