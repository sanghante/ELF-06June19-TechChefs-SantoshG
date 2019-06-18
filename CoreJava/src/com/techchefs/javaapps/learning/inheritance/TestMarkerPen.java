package com.techchefs.javaapps.learning.inheritance;

public class TestMarkerPen {

	public static void main(String[] args) {
		
		Pen p = new Pen();
		p.cost = 10;
		p.write();
		
		Marker m = new Marker();
		m.cost = 20;
		m.color();
		m.write();
		System.out.println(p.cost);
		System.out.println(m.cost);
		
		Pen marker = new Marker();
		marker.cost=20;
		marker.write();
	}
}
