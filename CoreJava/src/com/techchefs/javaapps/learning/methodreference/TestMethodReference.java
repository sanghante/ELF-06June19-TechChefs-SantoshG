package com.techchefs.javaapps.learning.methodreference;

public class TestMethodReference {

	public static void main(String[] args) {

		Room r = TestMethodReference :: open;
		r.remove();
	}

	static void open() {
		System.out.println("TestMethodReference.open() method ");
		System.out.println("Logic in open executed.");
	}
}

interface Room {
	void remove();
}