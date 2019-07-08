package com.techchefs.designpatterns.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) throws ParseException {

		MyImmutableClass class1 = new MyImmutableClass("Rama", 33, 9876543210d);
		
		log.info("name : "+class1.getName() );
		log.info("age : "+class1.getAge() );
		log.info("salary : "+class1.getSalary() );
		
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		
		EmployeeData data = new EmployeeData(34, 23, "girisha", "M", 105000, 9874563210L, "girisha@gmail.com", "designation", formater.parse("1998-01-20"), 112233, formater.parse("2019-05-05"), 30, 3);
		
		log.info(data.toString());
		
		EmployeeData2 newData2 = new EmployeeData2
										.EmployeeData2Builder()
										.id(1)
										.accountNumber(12345L)
										.age(44)
										.departmentId(30)
										.designation("desig")
										.dob(formater.parse("1998-2-1"))
										.email("email")
										.build();
		
		log.info(newData2.toString());
		
		
		EmployeeData3 newData3 = new EmployeeData3
									.EmployeeData3Builder()
									.departmentId(20)
									.id(45)
									.managerId(10)
									.name("data3")
									.accountNumber(1233L)
									.email("email").build();
		
		log.info(newData3.toString());
		
	}

}
