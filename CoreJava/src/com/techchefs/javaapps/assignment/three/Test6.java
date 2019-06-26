package com.techchefs.javaapps.assignment.three;

public class Test6 {

	public static void main(String[] args) {
		
		String sentence = "Hoga beda hudugi nana bittu";
		
		System.out.println(sentence);
		
		String split[] = sentence.split(" ");
		int j = 1;
		for (String string : split) {			
			if (j%2 == 1) {
				char ca[] = string.toCharArray();
				for(int i=ca.length-1; i >=0 ; i--) {
					System.out.print(ca[i]);
				}
				System.out.print(" ");
			} else {
				System.out.print(string+" ");
			}
			j++;
		}
	}
}
