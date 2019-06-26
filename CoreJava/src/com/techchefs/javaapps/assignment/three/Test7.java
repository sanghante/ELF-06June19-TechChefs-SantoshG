package com.techchefs.javaapps.assignment.three;

public class Test7 {

	public static void main(String[] args) {

		String input = "Hoga beda hudugi nana bittu";
		//String input = "one two three four five six seven eight nine ten";
		
		System.out.println(input);
		
		String[] split = input.split(" ");
		
		if (split.length % 2 == 0) {
			System.out.println("nothing to do...");
			return;
		} 
		
		String[] output = new String[split.length];
		
		int i=0;
		
		for (String string : split) {
			
			if( (i+2) % 2 == 0 ) {
				if (i+2 > output.length) {
				output[0] = split[split.length-1];
				} else 	{			
					output[i+2] = split[i];
				}
			    
			} else {
				output[i] = string;
			}
				i++;
		}
		
		for (String string : output) {
			System.out.print(string+" ");
		}
	}

}
