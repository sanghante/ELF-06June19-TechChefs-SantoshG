package com.techchefs.javaapps.learning.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

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
		
		List<Integer> result = aL.stream().filter(a -> a%3==0).collect(Collectors.toList());
		System.out.println(result);
		
		List<Integer> result1 = aL.stream().filter(a -> a%2!=0).collect(Collectors.toList());
		System.out.println(result1);
		
		List<Integer> result2 = aL.stream().map(a -> a*2).collect(Collectors.toList());
		System.out.println(result2);

		
	}
	
}
