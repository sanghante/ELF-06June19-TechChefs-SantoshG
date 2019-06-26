package com.techchefs.javaapps.learning.interfaces;

public class TestGoogle {

	public static void main(String[] args) {
		
		Browser browser = new Browser();
		Google gmail = new GMail();
		Google gdrive = new GDrive();
		
		browser.open(gmail);
		browser.open(gdrive);
		
	}
}
