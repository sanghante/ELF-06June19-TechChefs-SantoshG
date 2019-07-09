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

		Chips chipsObject = null;

		if (args != null && args.length > 0) {
			chipsObject = getInstance(args[0]);

			if (chipsObject != null)
				chipsObject.open();
			else
				System.out.println("No object returned");
		}
	}

	public static Chips getInstance(String str) {

		if (str == null)
			return null;
		if (str.equals("Lays")) {
			return new Lays();
		} else if (str.equals("Bingo")) {
			return new Bingo();
		} else if (str.equals("Kurkure")) {
			return new Kurkure();
		} else {
			return null;
		}

	}

}
