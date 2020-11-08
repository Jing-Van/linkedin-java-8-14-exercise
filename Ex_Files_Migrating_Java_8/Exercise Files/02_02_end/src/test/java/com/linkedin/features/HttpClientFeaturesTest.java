package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HttpClientFeaturesTest {

	@Test
	void sendGetTest() throws Exception {
		assertEquals(200, HttpClientFeatures.sendGet());
	}

}
