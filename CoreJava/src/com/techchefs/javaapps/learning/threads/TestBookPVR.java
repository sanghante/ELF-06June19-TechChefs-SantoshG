package com.techchefs.javaapps.learning.threads;

public class TestBookPVR {
	
	public static void main(String[] args) {
		
		PVR p = new PVR();
		
		Browser b1 = new Browser(p);
		Browser b2 = new Browser(p);
		
		b1.start();
		b2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p.leaveMe();
		
		
	}

}
