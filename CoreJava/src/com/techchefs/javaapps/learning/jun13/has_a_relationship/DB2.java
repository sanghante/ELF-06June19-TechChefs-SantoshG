package com.techchefs.javaapps.learning.jun13.has_a_relationship;

public class DB2 {

	void receive( Person p) {
		System.out.println("I am in DB2 receive");
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
