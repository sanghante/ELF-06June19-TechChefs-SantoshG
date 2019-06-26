package com.techchefs.javaapps.learning.threads;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {

	@Override
	public void run() {

		String s = getName();
		
		log.info("Thread name is "+s);

		for (int i = 0; i < 3; i++) {

			log.info("" + i);

			try {
				sleep(200);

			} catch (InterruptedException e) {
				log.info(e.getMessage());

			}
		}

		log.info("Pen run method");
	}

}//End class
