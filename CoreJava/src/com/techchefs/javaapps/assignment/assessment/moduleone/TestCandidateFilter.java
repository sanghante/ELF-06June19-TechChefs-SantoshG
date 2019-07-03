package com.techchefs.javaapps.assignment.assessment.moduleone;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class TestCandidateFilter {

	public static void main(String[] args) {

		Candidate c1 = new Candidate("Tina", Gender.FEMALE, 23.9);
		Candidate c2 = new Candidate("Meena", Gender.FEMALE, 73.4);
		Candidate c3 = new Candidate("Gina", Gender.FEMALE, 83.1);
		Candidate c4 = new Candidate("Rama", Gender.MALE, 43.2);
		Candidate c5 = new Candidate("Gottilla", Gender.OTHER, 83.8);
		
		ArrayList<Candidate> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);		
		
		long res = list.stream()
				.filter( c -> c.getGender().equals(Gender.FEMALE))
				.filter(d -> d.getPercentage() >=35.0).count();
		
		log.info("Number of passed female candidates is :"+res);
		
	}

}


enum Gender {
	MALE, FEMALE, OTHER;
}