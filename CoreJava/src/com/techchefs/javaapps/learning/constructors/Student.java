package com.techchefs.javaapps.learning.constructors;

public class Student {

	String name;
	int age;
	double percentage;
	
	Student(String name, int age, double percentage) {
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	
	void display() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Percentage is "+percentage);
	}
}
