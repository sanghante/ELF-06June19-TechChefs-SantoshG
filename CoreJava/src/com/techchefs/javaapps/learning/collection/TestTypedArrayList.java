package com.techchefs.javaapps.learning.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestTypedArrayList {
	
	public static void main(String[] args) {
		
		List<String> aList = new ArrayList<>();
		
		aList.add("Hi");
		aList.add("How");
		aList.add("Are");
		aList.add("You");
		aList.add("Doing");
		
		Iterator<String> itr = aList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		ListIterator<String> lItr = aList.listIterator();
		
		/*
		 * while (lItr.hasNext()) { String string = (String) lItr.next();
		 * System.out.println(string); string = (String) lItr.previous();
		 * System.out.println(string); lItr.next(); }
		 */
		
		ListIterator lit = aList.listIterator(aList.size()); 
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		
		for (String string : aList) {
			System.out.println(string);
		}
		
		System.out.println(aList);
		
	}
}
