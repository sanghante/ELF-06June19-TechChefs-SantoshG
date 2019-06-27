package com.techchefs.javaapps.learning.lambda.legacyinterfaceexamples;

public class TestLambdaThreads {
	
	public static void main(String[] args) {
		
		
		Runnable runnable = () -> {
			System.out.println("I am run in TestLambda");
			
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

	
		Thread t1 = new Thread(runnable);
		t1.start();	
	
	}
}
