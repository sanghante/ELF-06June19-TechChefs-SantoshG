package com.techchefs.javaapps.learning.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamNew {

	public static void main(String[] args) {
		
		List<Integer> aL = new ArrayList<>();
		aL.add(4);
		aL.add(6);
		aL.add(44);
		aL.add(41);
		aL.add(42);
		aL.add(14);
		aL.add(24);
		aL.add(48);
		aL.add(14);
		aL.add(45);
		aL.add(412);
		
		Comparator<Integer> c = (i,j) -> i.compareTo(j);
		
		int minValue = aL.stream().min(c).get();
		
		int maxValue = aL.stream().max(c).get();
		
		List<Integer> list = aL.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list);
		
		System.out.println(minValue);
		System.out.println(maxValue);
		
	}
	
}
