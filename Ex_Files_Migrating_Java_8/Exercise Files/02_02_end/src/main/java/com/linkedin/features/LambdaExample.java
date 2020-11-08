package com.linkedin.features;

import java.util.function.BiFunction;

import org.eclipse.jdt.annotation.NonNull;

public class LambdaExample {

	public static String varWithLambda(String value1, String value2) {
		
		BiFunction<String, String, String> lamda = (@NonNull var val1, @NonNull var val2) -> String.join(" ", val1, val2);
		return lamda.apply(value1, value2);
				
	}
}
