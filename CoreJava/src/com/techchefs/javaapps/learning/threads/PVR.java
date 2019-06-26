package com.techchefs.javaapps.learning.threads;

public class PVR {

	synchronized void book() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	synchronized void leaveMe() {
		notify();
	}
}
