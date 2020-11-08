package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwitchExpressionFeaturesTest {

	@Test
	void isFeedingTimeTest() {
		
		assertTrue(SwitchExpressionFeatures.isFeedingTime(2));

	}

}
