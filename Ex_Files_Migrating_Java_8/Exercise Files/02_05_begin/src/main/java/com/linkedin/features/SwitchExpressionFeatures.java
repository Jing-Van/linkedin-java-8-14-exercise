package com.linkedin.features;

public class SwitchExpressionFeatures {

	public static boolean isFeedingTime(int hour) {

		boolean isFeedingTime;

		switch (hour) {
		case 2, 16, 21 -> isFeedingTime = true;
		default -> isFeedingTime = false;
		}

		return isFeedingTime;
	}
}
