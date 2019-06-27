package com.techchefs.javaapps.learning.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.techchefs.javaapps.learning.StringOps;

@RunWith(Parameterized.class)
public class StringOpsMultiValueTest {

	private int value;
	private String name;	
	private StringOps strOps = new StringOps();

	public StringOpsMultiValueTest(String name, int value) {
		this.value = value;
		this.name = name;
	}
	
	@Parameters
	public static Collection<Object[]> getPairs() {
		
		Object[][] values = {
				{"San", 3},
				{"Venka", 5},
				{"Sharath", 7},
				{"Seena", 5}				
		};
		
		return Arrays.asList(values);
	}
	
	@Test
	public void testCount() {
		int actual = strOps.count(name);
		assertEquals(value, actual);
		
		
	}
	
}
