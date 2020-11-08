package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LambdaExampleTest {

	@Test
	void varWithLambdaTest() {
	
		var expected = "LinkedIn Learning!";
		var result = LambdaExample.varWithLambda(expected.split(" ")[0], expected.split(" ")[1]);
		
		assertEquals(expected, result);
	}

}
