package com.techchefs.javaapps.assignment.three;

public class Test5 {

	public static void main(String[] args) {

		String input = "how are you doing";
		
		System.out.println(input);
		
		String[] arr = input.split(" ");
		for (String string : arr) {
			char[] ca = string.toCharArray();
			for(int i = ca.length -1 ; i >=0; i--) {
				System.out.print(ca[i]);
			}
			System.out.print(" ");
		}		
	}

}
