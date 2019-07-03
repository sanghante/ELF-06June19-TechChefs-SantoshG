package com.techchefs.javaapps.assignment.assessment.moduleone;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {

	@Override
	public void sound() {
		log.info("Cow : Ambaa");
	}

}
