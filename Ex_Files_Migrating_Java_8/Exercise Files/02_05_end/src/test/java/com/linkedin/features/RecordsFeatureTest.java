package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecordsFeatureTest {

	@Test
	void myCatTest() {
		
		var athena = RecordsFeature.myCat();
		var athenaClone = RecordsFeature.myCat();
		
		System.out.println(athena.toString());
		System.out.println(String.format("Name: %s", athena.name()));
		System.out.println(String.format("Age: %s", athena.age()));

		assertEquals(athena.hashCode(), athenaClone.hashCode());
		assertTrue(athena.equals(athenaClone));
		
	}

}
