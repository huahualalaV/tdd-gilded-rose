package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
		Product agedBrie = new Product(10, initQuality, 13, "Aged Brie");
		assertTrue(agedBrie.getQuality() - initQuality > 0);
	}

	@Test
	void should_never_change_when_product_name_is_sulfuras() {
		Product sulfuras = new Product(null, 10, 100, "Sulfuras");
		assertEquals(Integer.valueOf(10), sulfuras.getQuality());
	}

	@Test
	void should_increase_2_quality_when_performance_in_grreater_than_10_and_product_name_is_backstage_pass() {
		Product backstagePass = new Product(10, 10, null, "Backstage pass", 17);
		assertEquals(Integer.valueOf(16), backstagePass.getQuality());
	}

	@Test
	void should_increase_3_quality_when_performance_in_grreater_than_5_and_product_name_is_backstage_pass() {
		Product backstagePass = new Product(10, 10, null, "Backstage pass", 14);
		assertEquals(Integer.valueOf(23), backstagePass.getQuality());
	}

	@Test
	void should_return_0_when_performance_in_is_over_sell_in_and_product_name_is_backstage_pass() {
		Product backstagePass = new Product(20, 10, null, "Backstage pass", 14);
		assertEquals(Integer.valueOf(0), backstagePass.getQuality());
	}
}
