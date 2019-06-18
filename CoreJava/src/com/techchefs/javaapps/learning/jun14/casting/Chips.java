package com.techchefs.javaapps.learning.jun14.casting;

public class Chips {

	void open() {
		System.out.println("Chips open");
	}
	
}


class Lays extends Chips {
	
	void eat() {
		System.out.println("Eat Lays");
		
	}
}

class Bingo extends Chips {
	
	void bite() {
		System.out.println("Bite Bingo");
		
	}
	
}