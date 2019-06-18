package com.techchefs.javaapps.learning.explore;

public class FactRecurrsion {
	
	static int factRecurrsive(int n) {
		
		if(n==0) {
			return 1;			
		}
		
		return n * factRecurrsive(n-1);
	}

	public static void main(String[] args) {
		
		System.out.println(factRecurrsive(5));

	}

}
