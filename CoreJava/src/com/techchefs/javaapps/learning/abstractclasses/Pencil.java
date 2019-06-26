package com.techchefs.javaapps.learning.abstractclasses;

public abstract class Pencil {

	void draw() {
		System.out.println("Draw");
	}
	
	abstract void color();
	abstract void write();
}


abstract class Pen extends Pencil {
	
	void color() {
		System.out.println("Color");
	}
	
}

class Marker extends Pen {
	
	void write() {
		System.out.println("Marker");
	}
}