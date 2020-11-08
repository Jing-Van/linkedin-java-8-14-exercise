package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.NumberFormat;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class NumberFormatFeaturesTest {

	@Test
	void getCompactFormatTest() {
	
		assertEquals("1M", NumberFormatFeatures.getCompactNumberFormat(1000000));
		
	}

	@Test
	void getCompactFormatWithLocalTest() {
	
		assertEquals("1 Million", NumberFormatFeatures.getCompactNumberFormat(1000000, Locale.GERMAN, NumberFormat.Style.LONG));
		
	}

}
