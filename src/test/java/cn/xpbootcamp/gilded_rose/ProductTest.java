package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	void should_decline_at_twice_the_rate_when_exist_days_more_than_sell_in() {
		Product product = new Product(10, 20, 13);
		assertEquals(Integer.valueOf(4), product.getQuality());
	}

	@Test
	void should_add_quality_when_product_name_is_aged_brie() {
		int initQuality = 20;
		Product agedBrie = new Product(10, initQuality, 13, "Aged Brie");
		assertEquals(Integer.valueOf(33), agedBrie.getQuality());
	}

	@Test
	void should_never_decline_when_product_name_is_sulfuras() {
		Integer sellIn = null;
		Product sulfuras = new Product(sellIn, 10, 100, "Sulfuras");
		assertEquals(Integer.valueOf(10), sulfuras.getQuality());
	}

	@Test
	void should_add_2_quality_a_day_when_performance_in_10_days_and_product_name_is_backstage_pass() {
		Product backstagePass = new Product(30, 10, 22, "Backstage pass");
		assertEquals(Integer.valueOf(34), backstagePass.getQuality());
	}

	@Test
	void should_increase_3_quality_when_performance_in_grreater_than_5_and_product_name_is_backstage_pass() {
		Product backstagePass = new Product(30, 10, 28, "Backstage pass");
		assertEquals(Integer.valueOf(49), backstagePass.getQuality());
	}

	@Test
	void should_return_0_when_performance_in_is_over_sell_in_and_product_name_is_backstage_pass() {
		Product backstagePass = new Product(20, 10, 21, "Backstage pass");
		assertEquals(Integer.valueOf(0), backstagePass.getQuality());
	}
}
