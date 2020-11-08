package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringFeaturesTest {

	@Test
	void indentTest() {
		var noIndentValue = "LinkedIn Learning!";
		var indentedValue = "  LinkedIn Learning!";

		assertEquals(indentedValue, StringFeatures.indent(noIndentValue, 2).stripTrailing());
		assertEquals(noIndentValue, StringFeatures.indent(indentedValue, -2).stripTrailing());
	}
	
	@Test
	void transformTest() {
		var value = "LinkedIn Learning!";
		
		assertEquals(value.toUpperCase(), StringFeatures.transform(s -> s.toUpperCase(), value));
		
	}

}
