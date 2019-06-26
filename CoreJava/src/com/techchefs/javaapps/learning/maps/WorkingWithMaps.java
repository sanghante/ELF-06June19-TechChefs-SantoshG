package com.techchefs.javaapps.learning.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class WorkingWithMaps {

	public static void main(String[] args) {

		Map<String, Integer> hMap = new HashMap<>();		
		Map<Character, Double> lhm = new LinkedHashMap<>();
		Map<String, Integer> tm = new TreeMap<>();

		tm.put("Four", 4);
		tm.put("Two", 2);
		tm.put("Five", 5);
		tm.put("One", 1);
		tm.put("Three", 3);
		
		lhm.put('o', 22.2);
		lhm.put('p', 45.2);
		lhm.put('q', 224.2);
		lhm.put('h', 232.2);
		lhm.put('k', 12.2);
		
		hMap.put("One", 1);
		hMap.put("Two", 2);
		hMap.put("Three", 3);
		hMap.put("Four", 4);
		hMap.put("Five", 5);
		
		System.out.println("Printing HashMap");
		for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
			System.out.println("Key is -> "+entry.getKey());
			System.out.println("Value is -> "+entry.getValue());
			System.out.println("******************");
		}
		
		System.out.println("Printing LinkedHashMap");
		for (Map.Entry<Character, Double> entry : lhm.entrySet()) {
			System.out.println("Key is -> "+entry.getKey());
			System.out.println("Value is -> "+entry.getValue());
			System.out.println("******************");
		}
		
		System.out.println("Printing TreeMap");
		for (Map.Entry<String, Integer> entry : tm.entrySet()) {
			System.out.println("Key is -> "+entry.getKey());
			System.out.println("Value is -> "+entry.getValue());
			System.out.println("******************");
		}
		
	}

}
