package com.linkedin.hsports.services;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.linkedin.hsports.HplusSportApiApplication;
import com.linkedin.hsports.domain.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=HplusSportApiApplication.class)
public class RecommendationServiceTest {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private RecommendationService recommendationService;

	@Test
	public void getRecommendationsTest() {
		
		Product product = this.productService.getProduct(524L);
		List<Product> products = this.recommendationService.recommend(product);
		assertNotNull(products);
		
	}

}
