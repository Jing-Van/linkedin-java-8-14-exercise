package com.linkedin.features;

public class SwitchExpressionFeatures {

	public static boolean isFeedingTime(int hour) {

		return switch (hour) {
		case 2, 16, 21 -> true;
		default -> {
				System.out.println("Meow!  Is it feeding time yet?");
				yield false;
			}
		};
	}
}
