package com.techchefs.javaapps.learning.abstraction;

public class TestMachine {

	public static void main(String[] args) {

		
		ATMMachine machine = new ATMMachine();
		ATMCard icici = new IciciATMCard();
		ATMCard hdfc = new HdfcATMCard();
		SbiATMCard sbi = new SbiATMCard();
		
		machine.slot(icici);
		machine.slot(hdfc);
		machine.slot(sbi);
	}

}
