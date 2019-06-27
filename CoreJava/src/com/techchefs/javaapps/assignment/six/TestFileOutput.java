package com.techchefs.javaapps.assignment.six;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutput {
	
	public static void main(String[] args) {
		
		File file = new File("d:\\mahadev.txt");
		
		String msg = "Hello I am Santosh";
		try (FileOutputStream fout = new FileOutputStream(file)) {
			
			fout.write(msg.getBytes());
			
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
