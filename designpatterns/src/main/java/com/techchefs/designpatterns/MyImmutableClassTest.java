package com.techchefs.designpatterns;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) {

		MyImmutableClass class1 = new MyImmutableClass("Rama", 33, 9876543210d);
		
		log.info("name : "+class1.getName() );
		log.info("age : "+class1.getAge() );
		log.info("salary : "+class1.getSalary() );
		
	}

}
