package com.techchefs.javaapps.assignment.jun13;

public class Test4 {

	public static void main(String[] args) {

		String input = "Hi my dear friends";
		
		System.out.println(input);
		
		String[] arr = input.split(" ");
		
		for (String string : arr) {
			System.out.print(string+string.length()+ " ");
		}
		
	}

}
