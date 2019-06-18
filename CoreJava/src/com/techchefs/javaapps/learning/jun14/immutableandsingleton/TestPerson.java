package com.techchefs.javaapps.learning.jun14.immutableandsingleton;

public class TestPerson {

	public static void main(String[] args) {
		
		Person person = new Person("Santosh", 37);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
		
	}
}
