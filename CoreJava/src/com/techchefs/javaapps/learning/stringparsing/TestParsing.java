package com.techchefs.javaapps.learning.stringparsing;

public class TestParsing {

	public static void main(String[] args) {
		
		String a = "10";
		String b = "12.3";
		String c = "True";
		
		int i = Integer.parseInt(a);
		double d = Double.parseDouble(b);
		boolean bool = Boolean.parseBoolean(c);
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(bool);
		
		Integer k ;
		k = 5;
		System.out.println(k.intValue());
	
	}
}
