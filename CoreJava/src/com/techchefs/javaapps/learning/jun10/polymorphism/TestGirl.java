package com.techchefs.javaapps.learning.jun10.polymorphism;

public class TestGirl {

	public static void main(String[] args) {

		Girl g = new Girl();

		Phone mi = new MiPhone();
		Phone i = new iPhone();

		g.receive(i);
		g.receive(mi);
	}

}
