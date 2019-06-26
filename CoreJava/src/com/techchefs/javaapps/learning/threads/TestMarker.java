package com.techchefs.javaapps.learning.threads;

public class TestMarker {

	public static void main(String[] args) {

		Marker m = new Marker();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		t1.start();
		t2.start();
	}

}
