package com.techchefs.javaapps.learning.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestHashSet {

	public static void main(String[] args) {

		
		HashSet<String> hs = new HashSet<>();
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		TreeSet<String> ts = new TreeSet<>();
		
		hs.add("rama");
		hs.add("bhima");
		hs.add("soma");
		hs.add("krishna");
		
		lhs.add("rama");
		lhs.add("bhima");
		lhs.add("soma");
		lhs.add("krishna");
		
		System.out.println(ts.add("rama"));
		System.out.println(ts.add("bhima"));
		System.out.println(ts.add("soma"));
		System.out.println(ts.add("krishna"));
		System.out.println(ts.add("rama"));
		System.out.println(ts.add("bhima"));
		System.out.println(ts.add("soma"));
		System.out.println(ts.add("krishna"));
		
		for(String rama : hs) {
			System.out.println(rama);
		}
		
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (String s : lhs) {
			System.out.println(s);
		}
		
		it = lhs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Treeset------>");
		for(String s : ts) {
			System.out.println(s);
			
		}
		/*
		 * it = ts.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
		
	}

}
