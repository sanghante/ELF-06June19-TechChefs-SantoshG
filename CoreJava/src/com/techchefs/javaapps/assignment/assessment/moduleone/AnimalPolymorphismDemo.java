package com.techchefs.javaapps.assignment.assessment.moduleone;

public class AnimalPolymorphismDemo {
	
	public static void main(String[] args) {
		
		
		Animal animal = null;
		
		Cow cow = new Cow();
		Lion lion = new Lion();
		
		animal = cow;
		animal.sound();
		
		animal = lion;
		animal.sound();
		
	}

}
