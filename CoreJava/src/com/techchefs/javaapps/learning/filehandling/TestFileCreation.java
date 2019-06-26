package com.techchefs.javaapps.learning.filehandling;

import java.io.File;
import java.io.IOException;

public class TestFileCreation {

	public static void main(String[] args) {

		File file = new File("d:/san.txt");
		
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
