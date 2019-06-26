package com.techchefs.javaapps.learning.beanobjects;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Gunda");
		p.setAge(24);
		
		DB2 db2 = new DB2();
		DB1 db1 = new DB1();
		
		db1.receive(p);
		db2.receive(p);
	}
}
