package com.techchefs.javaapps.learning.enums;

public class TestSwitch {
	
	public static void main(String[] args) {
		
		String s = "monday";
		
		switch (s) {
		case "monday":System.out.println("monday");
			
			break;
		case "tuesday":System.out.println("tuesday");
		
		break;
		case "wednesday":System.out.println("wednesday");
		
		break;
		case "thursday":System.out.println("thursday");
		
		break;
		case "friday":System.out.println("friday");
		
		break;
		case "saturday":System.out.println("saturday");
		
		break;
		case "sunday":System.out.println("sunday");
		break;
		
		default: System.out.println("what else is there buddy");
			break;
		}
		
		
	}

}
