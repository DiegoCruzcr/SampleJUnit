package com.duarte;

import static org.junit.Assert.*;

import org.junit.Test;

public class Contador{

	@Test
	public void test() {
		//fail("Not yet implemented");
		//fail("Not yet implemented");
		//instance of the test
		TestandoJunit test = new TestandoJunit();
		//Variable for test output
		int test_output = test.contadorDeLetras("Paralelepipedo");
		//Compare the results
		assertEquals(3, test_output);
	}

}
	