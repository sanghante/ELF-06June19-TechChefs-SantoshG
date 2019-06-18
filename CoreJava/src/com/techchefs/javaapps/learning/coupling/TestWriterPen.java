package com.techchefs.javaapps.learning.coupling;

public class TestWriterPen {

	public static void main(String[] args) {
		
		Pen pen = new Pen();
		Writer writer = new Writer();
		
		writer.receive(pen);
	}
}
