package com.linkedin.features;

import com.linkedin.features.RecordsFeature.Cat;

public class NullPointerFeatures {

	public static Cat causeNullPointer() {
		return new Cat(null,5);
	}
}
