package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class HttpClientFeaturesTest {

	@Test
	void sendGetTest() throws IOException {
		assertEquals(200, HttpClientFeatures.sendGet());
	}

}
