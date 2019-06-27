package com.techchefs.javaapps.learning.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.javaapps.learning.BooleanOps;

public class BooleanOpsTest {

	BooleanOps booleanOps = new BooleanOps();
	
	@Test
	public void testIsOddEven() {
		assertEquals(true, booleanOps.isOddEven(5));
	}


}
