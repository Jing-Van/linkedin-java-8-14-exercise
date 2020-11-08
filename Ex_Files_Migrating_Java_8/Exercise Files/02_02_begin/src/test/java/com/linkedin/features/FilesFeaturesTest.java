package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FilesFeaturesTest {

	@Test
	void writeStringTest() throws IOException {
		
		FilesFeatures.writeString("LinkedIn Learning!");
		var file = new File("example.txt");

		assertNotNull(file);
		assertTrue(file.getTotalSpace() > 0);
		
	}
	
	@Test
	void readStringTest() throws IOException {
	
		var expected = "LinkedIn Learning!";
		FilesFeatures.writeString(expected);
		
		var fileContents = FilesFeatures.readString(new File("example.txt"));
		
		assertEquals(expected, fileContents);
	}

}
