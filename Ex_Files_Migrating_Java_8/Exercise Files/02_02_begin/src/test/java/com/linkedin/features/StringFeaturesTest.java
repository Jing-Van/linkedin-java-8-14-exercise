package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringFeaturesTest {

	@Test
	void isBlankTest() {
		var value = "LinkedIn Learning!";
		var value2 = "    ";
	
		assertFalse(StringFeatures.isBlank(value));
		assertTrue(StringFeatures.isBlank(value2));
	}
	
	@Test
	void stripTest() {
		var expected = "LinkedIn Learning!";
		var value = " " + expected + " ";
		var value2 = '\u2000' + expected + '\u2000';
		
		assertEquals(expected, StringFeatures.strip(value));
		assertEquals(expected, StringFeatures.strip(value2));
		
	}
		
	@Test
	void stripLeadingTest() {
	
		var expected = "LinkedIn Learning! ";
		var value = " " + expected;
		var value2 = '\u2000' + expected;
		
		assertEquals(expected, StringFeatures.stripLeading(value));
		assertEquals(expected, StringFeatures.stripLeading(value2));
	}
	
	@Test
	void stripTrailingTest() {
	
		var expected = " LinkedIn Learning!";
		var value = expected + " ";
		var value2 = expected + '\u2000';
		
		assertEquals(expected, StringFeatures.stripTrailing(value));
		assertEquals(expected, StringFeatures.stripTrailing(value2));
	}

	@Test
	void repeatTest() {
		
		var value = "LinkedIn Learning! ";
		var expected = value + value;
		
		assertEquals(expected, StringFeatures.repeat(value, 2));
	}
	
	@Test
	void linesTest() {

		int expected = 2;
		var value = "LinkedIn Learning \n LinkedIn Learning";
		
		assertEquals(expected, StringFeatures.lines(value).count());
	}

}
