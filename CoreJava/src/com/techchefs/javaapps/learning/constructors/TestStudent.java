package com.techchefs.javaapps.learning.constructors;

public class TestStudent {

	public static void main(String[] args) {

		Student a = new Student("Rama", 23, 99);
		Student b = new Student("Sita", 21, 88);
		
		a.display();
		System.out.println("*********************");
		b.display();
	}

}
