package com.techchefs.javaapps.learning.jun13.arraysandstrings;

public class TestArrayDouble {
	
	public static void main(String[] args) {
		
		double[] dArray = new double[4];
		
		dArray[0] = 1.2;
		dArray[1] = 2.2;
		dArray[2] = 3.2;
		dArray[3] = 4.2;
		
		System.out.println(dArray.length);
		
		for(int i=0; i<dArray.length; i++) {			
			System.out.println(dArray[i]);
		}
		
		
		String []sArray = new String[4];
		
		sArray[0] = "Santosh";
		sArray[1] = "Vineesha";
		sArray[2] = "Sourabh";
		sArray[3] = "Namitha";
		
		System.out.println(sArray.length);
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		
		char cArray[] = new char[8];
		
		cArray[0] = 'S';
		cArray[1] = 'A';
		cArray[2] = 'N';
		cArray[3] = 'T';
		cArray[4] = 'H';
		cArray[5] = 'O';
		cArray[6] = 'S';
		cArray[7] = 'H';
		
		for(int j=cArray.length-1; j>=0; j--) {
			System.out.print(cArray[j]);
		}
		System.out.println();
		
		System.out.println(cArray.length);
		
		int[] iArray = {4, 0, 6};
		
		System.out.println(iArray.length);
		
		for(int i=0; i<iArray.length; i++) {
			System.out.println(iArray[i]);
		}
		
		
	}//end main

}
