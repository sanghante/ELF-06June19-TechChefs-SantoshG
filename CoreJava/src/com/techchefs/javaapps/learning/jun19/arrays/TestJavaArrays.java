package com.techchefs.javaapps.learning.jun19.arrays;

import java.util.Arrays;
import java.util.Collections;

public class TestJavaArrays {

	public static void main(String[] args) {

		
		int[] arr = new int[] {7, 90, 22, 1, 23, 45};
		
		Arrays.sort(arr);

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int index = Arrays.binarySearch(arr, 23);
		System.out.println(index);
		
		String[] sArray = new String[] {"Rama", "Bhima", "Soma", "Paramathma"};
		
		Arrays.sort(sArray);
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(sArray));
		
		
		Arrays.sort(sArray, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(sArray));
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
	}

}
