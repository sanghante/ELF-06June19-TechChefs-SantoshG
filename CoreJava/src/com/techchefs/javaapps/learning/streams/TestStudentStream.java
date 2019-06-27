package com.techchefs.javaapps.learning.streams;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TestStudentStream {
	
	
	static Comparator<Student> c = (n, m) -> {
		
		Double p1 = n.getPercentage();
		Double p2 = m.getPercentage();
		
		return p1.compareTo(p2);
	};

	public static void main(String[] args) {

		
		Student s1 = new Student("Ram", 1, 61.1);
		Student s2 = new Student("Shyam", 1, 81.1);
		Student s3 = new Student("Krishna", 1, 71.1);
		Student s4 = new Student("Mahadev", 1, 88.1);
		Student s5 = new Student("Ganesh", 1, 95.1);
		Student s6 = new Student("Subba", 1, 77.1);
		
		
		List<Student> list = new LinkedList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		Student topper = getTopper(list);
		
		System.out.println("Topper");
		System.out.println(topper);
		
		Student last = getLast(list);
		System.out.println("Last");
		System.out.println(last);
		
	}
	
	static Student getTopper(List<Student> ll) {
		
		return ll.stream().max(c).get();
	}

	static Student getLast(List<Student> ll) {
		
		return ll.stream().min(c).get();
	}
	
}
