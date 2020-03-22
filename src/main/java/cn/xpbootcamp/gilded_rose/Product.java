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
	private Integer existDays;

	public Product() {
	}

	public Product(Integer sellIn, Integer quality) {
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public Product(Integer sellIn, Integer quality, Integer existDays) {
		this.sellIn = sellIn;
		this.quality = quality;
		this.existDays = existDays;
	}

	public Integer getQuality() {
		if (existDays > sellIn) {
			quality -= (existDays - sellIn) * 2;
		}
		if (quality < 0) {
			quality = 0;
		}
		if (quality > 50) {
			quality = 50;
		}
		return quality;
	}
}
