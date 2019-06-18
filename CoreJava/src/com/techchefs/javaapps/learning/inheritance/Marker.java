package com.techchefs.javaapps.learning.inheritance;

public class Marker extends Pen {

	void color() {
		System.out.println("Color from Marker, which is child of pen");
	}

	@Override
	void write() {
		//super.write();
		System.out.println("Writing via Marker");
	}
	

}
