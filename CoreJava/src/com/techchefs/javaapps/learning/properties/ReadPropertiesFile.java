package com.techchefs.javaapps.learning.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) {

		try (FileInputStream fin = new FileInputStream("demo.properties")) {

			Properties p = new Properties();
			p.load(fin);
			
			Enumeration<Object> e = p.keys();
			while (e.hasMoreElements()) {
				String key = (String)e.nextElement();
				System.out.println("Key : "+key);
				System.out.println("Value : "+p.getProperty(key));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
