package com.techchefs.javaapps.assignment.jun21;

import java.util.function.Consumer;

public class LambdaMessage {

	public static void main(String[] args) {

		Consumer<String> printMessage = a -> System.out.println("Hello "+a);
		
		printMessage.accept("Santosh");
		
	}

}
