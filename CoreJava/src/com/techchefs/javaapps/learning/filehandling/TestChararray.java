package com.techchefs.javaapps.learning.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class TestChararray {

	public static void main(String[] args) {
		
		
		String msg = "How are you my dear friend";
		
		char c[] = msg.toCharArray();
		
		
		try {
			
			FileWriter fw = new FileWriter("password.txt");
			
			fw.write(c);
			
			System.out.println("Done...!");
			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
