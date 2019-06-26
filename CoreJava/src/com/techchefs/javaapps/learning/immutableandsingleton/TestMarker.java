package com.techchefs.javaapps.learning.immutableandsingleton;

public class TestMarker {
	
	public static void main(String[] args) {
		
		Marker a = Marker.getMarker();
		
		Marker b = Marker.getMarker();
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}
