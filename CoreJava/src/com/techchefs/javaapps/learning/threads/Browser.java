package com.techchefs.javaapps.learning.threads;

public class Browser extends Thread {

	PVR ref;
	
	public Browser(PVR p) {
		ref = p;
	}
	
	@Override
	public void run() {
		ref.book();
	}
}
