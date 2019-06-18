package com.techchefs.javaapps.learning.jun18.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestWriteObj {
	
	static StringBuilder sbr = new StringBuilder('a');
	
	public static void main(String[] args) {

		Person person = new Person();
		
		person.setAge(21);
		person.setName("Raghu");
		
		System.out.println(sbr.capacity());
		
		
		ObjectOutputStream obj = null;
		FileOutputStream fout = null;
		try {
			
			fout = new FileOutputStream("jun18.txt");
			obj = new ObjectOutputStream(fout);
			
			obj.writeObject(person);
			
			obj.flush();
			obj.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	void newMethod() {
		int i;
		i=1;
		System.out.println(i);
	}

}
