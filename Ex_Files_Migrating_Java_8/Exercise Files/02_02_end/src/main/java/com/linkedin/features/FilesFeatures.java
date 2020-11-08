package com.linkedin.features;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesFeatures {

	public static void writeString(String fileContent) throws IOException {

		Files.writeString(Paths.get("example.txt"), fileContent, StandardOpenOption.CREATE);
		
	}
	
	public static String readString(File file) throws IOException {
		
		return Files.readString(file.toPath()); 
	}
}
