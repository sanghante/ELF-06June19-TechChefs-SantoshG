package com.techchefs.javaapps.learning.threads;

public class Marker implements Runnable {

	@Override
	public void run() {

		System.out.println("I am run in Marker");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
