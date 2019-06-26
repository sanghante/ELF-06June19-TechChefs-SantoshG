package com.techchefs.javaapps.learning.threads;

public class Lenovo implements Runnable {

	String name = null;
	
	Lenovo(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(name+" "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
