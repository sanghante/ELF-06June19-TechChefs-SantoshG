package com.techchefs.javaapps.learning.constructorreference;

import lombok.extern.java.Log;

@Log
public class Pen {
	
	Pen() {
		log.info("I am in Pen constructor");
	}
	
	Pen(int a) {
		log.info("I am in Pen constructor with 1 parameter which is "+a);
	}

	
	void write() {
		log.info("I am in Pen write()");
	}
}
