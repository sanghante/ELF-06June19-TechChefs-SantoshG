package com.techchefs.javaapps.learning.streams;

import java.util.stream.Stream;

public class TestSystemOut {

	public static void main(String[] args) {

		Integer[] a = {7, 3, 1, 99, 6, 22, 11};
		
		Stream<Integer> s1 = Stream.of(7, 3, 1, 99, 6, 22, 11);
		Stream<Integer> s2 = Stream.of(a);
		
		Demo d = System.out::print;
		
		s1.forEach(i -> d.print(i));
		s2.forEach(System.out::println);
		
	}

}
