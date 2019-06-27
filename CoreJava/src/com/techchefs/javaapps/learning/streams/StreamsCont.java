package com.techchefs.javaapps.learning.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCont {

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
		
		Collections.sort(aL);
		System.out.println(aL);

		long i = aL.stream().filter(a -> a % 3 == 0).count();
		System.out.println("Filter returned " +i+ " objects");
		
		//sort and collect into a list and print
		Stream<Integer> s = aL.stream().sorted();
		System.out.println(s.collect(Collectors.toList()));
		
		//custom sort - pass comparator to sort
		Stream<Integer> s1 = aL.stream().sorted((a, b) -> a.compareTo(b)*-1);
		System.out.println(s1.collect(Collectors.toList()));
		
		aL.stream().forEach( a -> System.out.println(a));
		
		
		
	}

}
