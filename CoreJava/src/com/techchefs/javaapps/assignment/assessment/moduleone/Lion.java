package com.techchefs.javaapps.assignment.assessment.moduleone;

import lombok.extern.java.Log;

@Log
public class Lion extends Animal {

	public Lion() {
	}

	@Override
	public void sound() {
		log.info("Lion - Roaarr");
	}

}
