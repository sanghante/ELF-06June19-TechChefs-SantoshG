package com.techchefs.javaapps.learning.objectclass;

public class TestStudent {

	public static void main(String[] args) {

		
		Student s1 = new Student("Mahesha", 22, 'M');
		Student s2 = new Student("Gowri", 22, 'F');
	
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
