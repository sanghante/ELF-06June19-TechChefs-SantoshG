package com.techchefs.javaapps.assignment.jun13;

public class StringReverse {

	public static void main(String[] args) {

		String abc = "Sample String";
		
		System.out.println("Input : "+abc);
		
		char[] arr = abc.toCharArray();
		
		System.out.print("Output : ");
		for(int i = abc.length()-1 ; i >= 0; i-- ) {
			
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		StringBuilder sbBuilder = new StringBuilder("String Builder Sample");
		System.out.println("Input :"+sbBuilder.toString());
		System.out.println("Output :"+sbBuilder.reverse());
	}

}
