package com.techchefs.javaapps.learning.streams;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestGroupOfObjects {

	public static void main(String[] args) {

		Integer[] a = {7, 3, 1, 99, 6, 22, 11};
		
		Stream<Integer> s1 = Stream.of(7, 3, 1, 99, 6, 22, 11);
		Stream<Integer> s2 = Stream.of(a);
		
		s1.forEach(i -> log.info(""+i));
		s2.forEach(i -> log.info(""+i));
		
	}

}
