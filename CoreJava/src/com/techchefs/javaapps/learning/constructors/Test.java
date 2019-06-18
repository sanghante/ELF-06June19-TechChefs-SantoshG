package com.techchefs.javaapps.learning.constructors;

class ABC {

	int i = 90;
}

class XYZ extends ABC {
	int i = 60;
	
	void a() {
		int i = 30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}

public class Test{
	
	public static void main(String[] args) {
		
		XYZ a = new XYZ();
		
		a.a();
	}
	
}