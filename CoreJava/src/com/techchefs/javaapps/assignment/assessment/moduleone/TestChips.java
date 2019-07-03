package com.techchefs.javaapps.assignment.assessment.moduleone;

public class TestChips {

	
	public static void main(String[] args) {
		
			Chips c = new Lays();
			Chips d = new Bingo();
			Chips k = new Kurkure();
			
			c.open();
			d.open();
			k.open();
			
			Lays l = (Lays) c;
			Bingo b = (Bingo) d;
			
			l.eat();
			b.bite();
	
	}
	
	public Chips getInstance(String str) {
		
		return null;
	}
	
}
