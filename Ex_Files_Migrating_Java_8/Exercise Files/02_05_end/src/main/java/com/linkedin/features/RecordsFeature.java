package com.linkedin.features;

public class RecordsFeature {

	public record Cat(String name, int age) {}
	
	public static Cat myCat() {
		
		return new Cat("Athena", 5);
		
	}
}
