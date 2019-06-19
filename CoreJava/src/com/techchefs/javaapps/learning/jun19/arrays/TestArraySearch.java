package com.techchefs.javaapps.learning.jun19.arrays;

public class TestArraySearch {

	public static void main(String[] args) {

		int c, n = 5, search, array[];

		array = new int[n];

		for (c = 0; c < n; c++)
			array[c] = c;

		search = 4;

		for (c = 0; c < n; c++) {
			if (array[c] == search) /* Searching element is present */
			{
				System.out.println(search + " is present at location " + (c + 1) + ".");
				break;
			}
		}
		if (c == n) /* Element to search isn't present */
			System.out.println(search + " isn't present in array.");
	}

}
