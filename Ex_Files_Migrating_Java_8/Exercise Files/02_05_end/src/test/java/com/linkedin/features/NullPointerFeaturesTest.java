package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NullPointerFeaturesTest {

	@Test()
	void causeNullPointerTest() {

		assertThrows(NullPointerException.class, () -> {

			try {
				
				var nullCat = NullPointerFeatures.causeNullPointer();
				nullCat.name().toUpperCase();

			} catch (NullPointerException ex) {
				ex.printStackTrace();
				throw ex;
			}

		});

	}
	
}
