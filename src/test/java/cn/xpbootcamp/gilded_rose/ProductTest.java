package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Assertions;
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

	@Test
	void should_declines_at_twice_the_rate_when_sell_in_is_over() {
		Product product = new Product(10, 20, 13);
		assertEquals(Integer.valueOf(14), product.getQuality());
	}

	@Test
	void should_increase_quality_when_sellIn_is_over_and_product_name_is_aged_brie() {
		int initQuality = 20;
		Product product = new Product(10, initQuality, 13, "Aged Brie");
		assertTrue(product.getQuality() - initQuality > 0);
	}
}
