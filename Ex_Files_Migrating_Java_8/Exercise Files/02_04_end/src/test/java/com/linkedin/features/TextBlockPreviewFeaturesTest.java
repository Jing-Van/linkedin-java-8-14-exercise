package com.linkedin.features;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class TextBlockPreviewFeaturesTest {

	@Test
	@Order(1)
	void getTextBlockTest() {
		System.out.println(TextBlockPreviewFeatures.getTextBlock());
	}

	@Test
	@Order(2)
	void stripIndentTest() {
		System.out.println(TextBlockPreviewFeatures.stripIndent());
	}

	@Test
	@Order(3)
	void translateEscapesTest() {
		System.out.println(TextBlockPreviewFeatures.translateEscapes());
	}
	
	@Test
	@Order(4)
	void formattedTest() {
		System.out.println(TextBlockPreviewFeatures.formatted("Migrating Beyond Java 8", "LinkedIn Learning"));
	}

}
