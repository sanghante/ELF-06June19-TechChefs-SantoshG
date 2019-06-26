package com.techchefs.javaapps.learning.threads;

import lombok.extern.java.Log;

@Log(topic = "test")
public class TestPenThread {

	public static void main(String[] args) {
		
		log.info("Main started");
		Pen t1 = new Pen();
		Pen t2 = new Pen();
		Pen t3 = new Pen();
		t1.setName("Mahadev");
		t2.setName("Rama");
		t3.setName("Krishna");
				
		t1.start();		
		t2.start();
		t3.start();
	
		log.info("Main ended");
		
	}
}
