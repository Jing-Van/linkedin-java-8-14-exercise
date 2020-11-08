package com.linkedin.features;

public class TextBlockPreviewFeatures {

	public static String getTextBlock() {
	
		String multilineText = """
					{
						"course":"Migrating Beyond Java 8",
						"platform":"LinkedIn Learning"
					}""";
		
//		String multilineText = 
//				  "  {\n"
//				+ "    \"course\":\"Migrating Beyond Java 8\",\n"
//				+ "    \"platform\":\"LinkedIn Learning\"\n"
//				+ "  }";

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

		return multilineText.stripIndent(); 
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
		
		return multilineText.translateEscapes(); 
	}
	
	public static String formatted(String value1, String value2 ) {
		
		String multilineText = """
                {
                  "course":"%s",
                  "platform":"%s"
                }
                """;
		
		System.out.println("\nFormatted:");
		return multilineText.formatted(value1, value2); 
	}
}