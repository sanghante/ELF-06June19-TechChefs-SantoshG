package com.techchefs.javaapps.learning.coupling;

public class Writer {

	void receive(Pen pen) {
		pen.open();
		pen.write();
	}
}
