package com.techchefs.javaapps.learning.filehandling;

import java.io.File;

public class TestFolder {

	public static void main(String[] args) {

		File file = new File("movies/kannada/jinkalaka");
		
		System.out.println(file.mkdir());
	}
}
