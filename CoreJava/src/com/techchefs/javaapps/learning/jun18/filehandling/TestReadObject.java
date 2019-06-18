package com.techchefs.javaapps.learning.jun18.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestReadObject {

	public static void main(String[] args) {

		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		
		try {
		
			fin = new FileInputStream("jun18.txt");
			ois = new ObjectInputStream(fin);
			
			Person p = null;
			
			p = (Person) ois.readObject();
			
			System.out.println(p.getAge());
			System.out.println(p.getName());
		
		} catch (IOException | ClassNotFoundException e)  {
			
			e.printStackTrace();
			
		} finally {

			try {

				if (fin != null)
					fin.close();
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}//end main

}
