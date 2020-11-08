package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwitchStatementFeaturesTest {

	@Test
	void isFeedingTimeTest() {
		
		assertTrue(SwitchStatementFeatures.isFeedingTime(2));

	}

}
