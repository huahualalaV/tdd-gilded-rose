package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
	@Test
	void should_return_0_when_product_quality_less_than_0() {
		Product product = new Product(10, -10);
		assertEquals(Integer.valueOf(0), product.getQuality());
	}

	@Test
	void should_return_50_when_product_quality_greater_than_50() {
		Product product = new Product(10, 80);
		assertEquals(Integer.valueOf(50), product.getQuality());
	}
}
