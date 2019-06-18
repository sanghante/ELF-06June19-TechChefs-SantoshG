package com.techchefs.javaapps.learning.jun13.beanobjects;

public class DB1 {

	void receive(Person p) {
		System.out.println("I am in DB1 receive");
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
