package com.techchefs.javaapps.learning.enums;

public class TestEnum {

	public static void main(String[] args) {

		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE.ordinal());
		
		Gender test = Gender.MALE;
		int i = 1;
		
		switch (test) {
		case MALE: System.out.println("Male");
			
			break;
			
		case FEMALE:System.out.println("Female");
			
			break;
			
		case OTHER:System.out.println("Other");
			
			break;

		}
	}

}
