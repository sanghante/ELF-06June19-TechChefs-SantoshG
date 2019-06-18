package com.techchefs.javaapps.learning.inheritance;

public class TestFatherSon {

	public static void main(String[] args) {
		
		Father f = new Son();
		Father f1 = new Father();
		f.bike();
		f1.bike();
		
		Son s = new Son();
		s.bike();
	}
}
