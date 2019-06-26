package com.techchefs.javaapps.learning.collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		
		List aList = new ArrayList();
		
		aList.add(553);
		aList.add(1234.5678);
		aList.add("Sangria");
		aList.add(new String("Sangria"));
		aList.add(true);
		aList.add(null);
		System.out.println("Size : "+aList.size());
		
		for(Object obj : aList) {
			System.out.println(obj);
		}
		
	}

}
