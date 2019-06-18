package com.techchefs.javaapps.learning.jun18.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriteChar {
	
	public static void main(String[] args) {

		String msg = "I am feeling sleepy!";
		byte ba[] = msg.getBytes();
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("san.txt", true);
			fileOutputStream.write(ba);
			
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
