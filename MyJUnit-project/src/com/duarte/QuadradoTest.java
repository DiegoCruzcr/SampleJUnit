package com.duarte;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuadradoTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		//instance of the test
		TestandoJunit test = new TestandoJunit();
		//Variable for test output
		int test_output = test.quadrado(5);
		//Compare the results
		assertEquals(25, test_output);
	}

}
