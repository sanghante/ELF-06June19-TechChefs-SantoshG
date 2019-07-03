package com.techchefs.javaapps.learning.streams;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestAssignment {

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
		
		Function<Student, Student> f = s -> {
			if (s.getName()!=null)
				s.setName("MR."+s.getName());
			return s;
		};
		
		
		list.stream().map(f).collect(Collectors.toList()).forEach(s -> System.out.println(s.getName()));
		
	}

}
