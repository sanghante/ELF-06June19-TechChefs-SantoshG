package com.techchefs.javaapps.learning.jun20.sortingwithcomparable;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetProduct {

	public static void main(String[] args) {
		
		Set<Product> ts = new TreeSet<>();
		ts.add(new Product("LG TV", 20000, 4.8));
		ts.add(new Product("Sony TV", 30000, 4.4));
		ts.add(new Product("Philips TV", 23000, 4.1));
		ts.add(new Product("Samsung TV", 25000, 4.7));
		ts.add(new Product("TCL TV", 10000, 3.8));
		ts.add(new Product("BPL TV", 11000, 3.6));
		
		
		for (Product product : ts) {
			System.out.println(product);
		}
		
	}
	
}
