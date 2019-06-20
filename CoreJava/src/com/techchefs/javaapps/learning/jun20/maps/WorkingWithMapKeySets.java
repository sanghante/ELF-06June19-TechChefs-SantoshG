package com.techchefs.javaapps.learning.jun20.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;

public class WorkingWithMapKeySets {

	public static void main(String[] args) {
		
		Map<String, Integer> hMap = new HashMap<>();	
		
		hMap.put("One", 1);
		hMap.put("Two", 2);
		hMap.put("Three", 3);
		hMap.put("Four", 4);
		hMap.put("Five", 5);
		
		System.out.println("Printing HashMap Keys");
		
		for (String set : hMap.keySet()) {
			System.out.println(set);
			System.out.println("******************");
		}
		
		System.out.println("Pringing HashMap Values");
		
		Collection<Integer> ci = hMap.values();
		Iterator<Integer> it = ci.iterator();
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
		
		
	}

}
