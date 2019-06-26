package com.techchefs.javaapps.learning.immutableandsingleton;

public class Marker {
	
	private static final Marker marker = new Marker();
	
	private Marker() {
		
	}
	
	public static Marker getMarker() {
		return marker;
	}

}
