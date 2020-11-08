package com.linkedin.features;

import java.util.function.Function;

public class StringFeatures {

	public static String indent(String value, int indent) {
		return String.format("%1$" + (indent + value.length()) + "s", value);
	}
	
	public static String transform(Function<String,String> transformation, String value) {
		return transformation.apply(value);
	}
	
}
