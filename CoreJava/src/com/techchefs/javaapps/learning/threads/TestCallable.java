package com.techchefs.javaapps.learning.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {

	public static void main(String[] args) {
		
		Pencil p1 = new Pencil();
		
		FutureTask<Integer> ft = new FutureTask<Integer>(p1);
		
		Thread t1 = new Thread(ft);
		t1.start();
		
		int i = 0;
		try {
			i = ft.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println(i);
		
	}
}
