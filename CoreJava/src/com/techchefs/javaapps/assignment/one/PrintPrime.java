package com.techchefs.javaapps.assignment.one;

public class PrintPrime {

	public static void main(String[] args) {
		
		IsPrime iP = new IsPrime();
		for(int i=1; i<=100; i++) {
			if(iP.main(i)) {
				System.out.println(i);
			}
		}
	}
}
