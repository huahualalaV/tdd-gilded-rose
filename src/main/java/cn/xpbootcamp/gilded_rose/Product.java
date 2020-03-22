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
	private Integer existDays = 0;
	private String name = "";

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

	public Product(Integer sellIn, Integer quality, Integer existDays, String name) {
		this.sellIn = sellIn;
		this.quality = quality;
		this.existDays = existDays;
		this.name = name;
	}

	public Integer getQuality() {
		int specialFlag = 0;
		if ("Aged Brie".equals(name)) {
			specialFlag = 1;
		}

		if (existDays > sellIn) {
			if (specialFlag == 1) {
				quality += existDays - sellIn;
			} else {
				quality -= (existDays - sellIn) * 2;
			}
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
