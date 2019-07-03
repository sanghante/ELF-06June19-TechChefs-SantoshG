package com.techchefs.javaapps.assignment.assessment.moduleone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class ListPolymorphism {

	public ListPolymorphism() {

	}

	
	public static void main(String[] args) {
		
		List list = getList("Vector");
		
		//list = getList("ArrayList");
		
		//list = getList("LinkedList");
		
		log.info(""+list.size());
		
	}
	
	private static List getList(String listType) {
		
		List list = null;
		String listRequired = "ArrayList";
		
		switch (listRequired) {
		case "ArrayList" : list = new ArrayList();
			break;
			
		case "Vector"	: list = new Vector();
		break;
		
		case "LinkedList" : list = new LinkedList();
		break;
		
		default:
			log.info("Invalid request, null reference returned");
		
		}
		
		return list;
	}
		
}
