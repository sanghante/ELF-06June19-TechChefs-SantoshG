package com.techchefs.javaapps.learning.explore;

public class LanguageOptions {

	public static void main(String[] args) {

		
		int option =  4;
		String language = "";
		
		switch (option) {
		case 1: language = "Kannada";
		break;
		
		case 2: language = "English";
		break;
		
		case 3: language = "Hindi";
		break;
		
		case 4: language = "Tamil";
		break;
		
		default: System.out.println("Invalid option selected, options are 1, 2, 3, 4");
		break;
		
		}
		
		if (language.length() > 0) {
			System.out.println("Language selected is :" +language);		
		}		
		
	}

}
