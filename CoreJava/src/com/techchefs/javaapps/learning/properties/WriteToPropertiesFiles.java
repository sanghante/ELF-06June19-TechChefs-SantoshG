package com.techchefs.javaapps.learning.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFiles {

	public static void main(String[] args) {

		try (FileOutputStream fout = new FileOutputStream("demo.properties")) {
			
			Properties properties = new Properties();
			
			properties.setProperty("CompanyName", "TechChefs");
			properties.setProperty("CompanyAdd", "Jayanagar 4th block");
			properties.setProperty("CompanyContactNo", "9876543210");
			
			properties.store(fout, "Company Details");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
