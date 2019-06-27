package com.techchefs.javaapps.learning.streams;

import java.util.stream.Stream;

public class TestMethodReference {

	public static void main(String[] args) {

		Demo d = i -> System.out.println(i);
		
		d.print(10);
		
		Pen p = new Pen();		
		d = p::write;		
	//	d.print(10);
		
		Integer[] a = {7, 3, 1, 99, 6, 22, 11};		
		Stream<Integer> s1 = Stream.of(7, 3, 1, 99, 6, 22, 11);
		
		s1.forEach(p::write);
		
	}

}

@FunctionalInterface
interface Demo {
	void print(int a);
}


class Pen {
	
	void write(int a) {
		System.out.println(a*2);
	}
}