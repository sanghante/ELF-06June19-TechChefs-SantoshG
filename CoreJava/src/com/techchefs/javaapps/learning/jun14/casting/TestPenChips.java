package com.techchefs.javaapps.learning.jun14.casting;

public class TestPenChips {

	
	public static void main(String[] args) {
		
			Pen p = new Marker();
			p.cost = 10;
			p.write();
			
			Marker m = (Marker)p;
			
			m.size = 1;
			m.color();
			
			
			Chips c = new Lays();
			Chips d = new Bingo();
			
			c.open();
			d.open();
			
			Lays l = (Lays) c;
			Bingo b = (Bingo) d;
			
			l.eat();
			b.bite();
			
			Bus bus = new Van();
			bus.model =1;
			bus.move();
			
			Van van = (Van)bus;
			
			van.seats=20;
			van.turn();
	
	}
	
}
