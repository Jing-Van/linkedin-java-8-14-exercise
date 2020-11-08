package com.linkedin.features;

public class TextBlockPreviewFeatures {

	public static String getTextBlock() {
		
		String multilineText = 
				  "  {\n"
				+ "    \"course\":\"Migrating Beyond Java 8\",\n"
				+ "    \"platform\":\"LinkedIn Learning\"\n"
				+ "  }";

		System.out.println("Text Block:");

		return multilineText;
	}
	
	public static String stripIndent() {
		
		String multilineText = 
				  "  {\n"
				+ "    \"course\":\"Migrating Beyond Java 8\",\n"
				+ "    \"platform\":\"LinkedIn Learning\"\n"
				+ "  }";

		System.out.println("\nBefore stripIndent:");
		System.out.println(multilineText);
		System.out.println("\nAfter stripIndent:");

		return multilineText; 
	}
			
	public static String translateEscapes() {
		
		String multilineText = 
				  "  {\\n"
				+ "    \"course\":\"Migrating Beyond Java 8\",\\n"
				+ "    \"platform\":\"LinkedIn Learning\"\\n"
				+ "  }";

		System.out.println("\nBefore translateEscapes:");
		System.out.println(multilineText);
		System.out.println("\nAfter translateEscapes:");
		
		return multilineText; 
	}
	
	public static String formatted(String value1, String value2 ) {
		
		String multilineText = """
                {
                  "course":"%s",
                  "platform":"%s"
                }
                """;
		
		System.out.println("\nFormatted:");
		return String.format(multilineText, value1, value2);
	}
}