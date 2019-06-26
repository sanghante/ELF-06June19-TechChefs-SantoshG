package com.techchefs.javaapps.learning.annotations;


import lombok.extern.java.Log;

@Log
public class MyArrayListTest {
	
	//private static final Logger log = Logger.getLogger("MyApp");

	public static void main(String[] args) {
		
		MyArrayList myArrayClass = new MyArrayList();
		int size = 21;
		
		//Adding Values
		for(int i=0; i<size; i++) {
			myArrayClass.add("Value : "+i);
		}
		
		//Removing from 4th position
		long start = System.currentTimeMillis();		
		//myArrayClass.remove(3);		
		myArrayClass.remove(13);		
		myArrayClass.remove(8);
		long end = System.currentTimeMillis();
		
		//Getting Values
		for(int i=0; i<myArrayClass.size(); i++) {
			log.info("Getting value : "+myArrayClass.get(i));
		}		
		
		log.info("Time : "+(end-start)+" millisecs");		
		log.info(""+myArrayClass.size());
	}
}
