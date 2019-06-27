package com.techchefs.javaapps.learning.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.javaapps.learning.StringOps;

public class StringOpsTest {
	
	StringOps strOps = new StringOps();

	@Test
	public void testCount() {
		assertEquals(5,  strOps.count("Santu"));
	}

	@Test(expected = NullPointerException.class)
	public void testCountForException() {
		strOps.count(null);
	}
}
