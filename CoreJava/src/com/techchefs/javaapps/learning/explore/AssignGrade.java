package com.techchefs.javaapps.learning.explore;

public class AssignGrade {

	public static void main(String[] args) {

		int marks = 36;
		String grade = "";
		
		if (marks >= 90) {
			grade = "A";
		} else if (marks >= 70) {
			grade = "B";
		} else if (marks >= 60) {
			grade = "C";
		} else if (marks >= 50) {
			grade = "D";			
		} else if (marks >=40) {
			grade = "E";
		} else {
			grade = "F";
		}
		
		System.out.println("Grade is : "+grade);
	}

}
