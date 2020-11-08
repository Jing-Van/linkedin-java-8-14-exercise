package com.linkedin.features;

public class SwitchStatementFeatures {

	public static boolean isFeedingTime(int hour) {

		boolean isFeedingTime;

		switch (hour) {
		case 2:
		case 16:
		case 21:
			isFeedingTime = true;
		default:
			isFeedingTime = false;
		}
		
		return isFeedingTime;
	}
}
