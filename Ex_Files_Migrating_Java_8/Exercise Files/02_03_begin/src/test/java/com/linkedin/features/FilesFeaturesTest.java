package com.linkedin.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.jupiter.api.Test;

class FilesFeaturesTest {

	@Test
	void mistMatchTest() throws IOException {
		
		File file1 = new File("example1.txt");
		File file2 = new File("example2.txt");
		File file3 = new File("example3.txt");
		
		var content1 = "LinkedIn Learning!";
		var content2 = "Linked In Learning!";
		
		Files.writeString(Paths.get(file1.getName()),content1, StandardOpenOption.CREATE);
		Files.writeString(Paths.get(file2.getName()),content2, StandardOpenOption.CREATE);
		Files.writeString(Paths.get(file3.getName()),content2, StandardOpenOption.CREATE);
	
		assertEquals(6L, FilesFeatures.mistmatch(file1, file2));
		assertEquals(-1L, FilesFeatures.mistmatch(file2, file3));
	}

}
