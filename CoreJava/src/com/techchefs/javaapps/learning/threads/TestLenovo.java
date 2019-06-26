package com.techchefs.javaapps.learning.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestLenovo {

	public static void main(String[] args) {

		Lenovo l1 = new Lenovo("one");
		Lenovo l2 = new Lenovo("two");
		Lenovo l3 = new Lenovo("three");
		Lenovo l4 = new Lenovo("four");
		Lenovo l5 = new Lenovo("five");
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		service.execute(l1);
		service.execute(l2);
		service.execute(l3);
		service.execute(l4);
		service.execute(l5);
		service.execute(l2);
		service.execute(l1);
		
		service.shutdown();
		
	}

}
