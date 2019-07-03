package com.techchefs.javaapps.assignment.assessment.moduleone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFiles {

	public static void main(String[] args) {

		try (FileOutputStream fout = new FileOutputStream("personal.properties")) {
			
			Properties properties = new Properties();
			
			properties.setProperty("Name", "Santosh");
			properties.setProperty("Add", "Near Ashoka Pillar");
			properties.setProperty("ContactNo", "9876543210");
			
			properties.store(fout, "Personal Details");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
