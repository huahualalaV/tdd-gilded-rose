package cn.xpbootcamp.gilded_rose;

/**
 * @ClassName Product
 * @Description TODO
 * @Author zijie.jiang
 * @Date 2020-03-21 19:30
 * @Version 1.0
 */
public class Product {
	private Integer sellIn;
	private Integer quality;

	public Product() {
	}

	public Product(Integer sellIn, Integer quality) {
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public Integer getQuality() {
		if (quality < 0) {
			quality = 0;
		}
		if (quality > 50) {
			quality = 50;
		}
		return quality;
	}
}
