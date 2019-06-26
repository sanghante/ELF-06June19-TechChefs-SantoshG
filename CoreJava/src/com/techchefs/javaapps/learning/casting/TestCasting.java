package com.techchefs.javaapps.learning.casting;

public class TestCasting {

	public static void main(String[] args) {

		
		Animal a = new Cow();
		
		a.a = 1;
		a.eat();
		
		Cow c = (Cow) a;
		
		c.a = 2;
		c.c = 4;
		c.eat();
		c.run();
		
	}

}
