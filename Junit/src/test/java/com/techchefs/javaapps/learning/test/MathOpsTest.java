package com.techchefs.javaapps.learning.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.javaapps.learning.MathOps;

public class MathOpsTest {

	MathOps mathOps = new MathOps();
	
	@Test
	public void testAdd() {
		assertEquals(45, mathOps.add(34, 11));
	}

	@Test
	public void testDiv() {
		assertEquals(3, mathOps.div(33, 11));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivForException() {
		mathOps.div(10, 0);
	}

}
