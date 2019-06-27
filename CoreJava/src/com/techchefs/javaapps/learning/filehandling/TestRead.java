package com.techchefs.javaapps.learning.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TestRead {

	public static void main(String[] args) {

		
		FileInputStream fileInputStream;
		FileReader fr;

		int i;
		try {
			
			fileInputStream = new FileInputStream("san.txt");
			fr = new FileReader("san.txt");
			
			while ( (i=fileInputStream.read()) != -1) {
				System.out.print((char)i);
			}
			
			while( (i=fr.read())!=-1 ) {
				System.out.print((char)i);
			}
			
			fileInputStream.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
