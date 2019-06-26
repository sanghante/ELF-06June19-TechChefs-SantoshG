package com.techchefs.javaapps.learning.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class FileHandlingExampleApache {

	public static void main(String[] args) {

		try {
			FileUtils.writeStringToFile(new File("jun18_1.txt"), "My test file contents with default charset", Charset.defaultCharset());
			
			System.out.println("File created");
			
			System.out.println(FileUtils.readFileToString(new File("jun18.txt"), Charset.defaultCharset()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
