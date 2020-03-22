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
	private Integer performanceIn = 0;

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

	public Product(Integer sellIn, Integer quality, Integer existDays, String name, Integer performanceIn) {
		this.sellIn = sellIn;
		this.quality = quality;
		this.existDays = existDays;
		this.name = name;
		this.performanceIn = performanceIn;
	}

	public Integer getQuality() {
		int specialFlag = 0;
		if ("Aged Brie".equals(name)) {
			specialFlag = 1;
		} else if ("Sulfuras".equals(name)) {
			specialFlag = 2;
		} else if ("Backstage pass".equals(name)) {
			specialFlag = 3;
		}

		if (specialFlag != 2) {
			if (specialFlag == 3) {
				int distance = performanceIn - sellIn;
				if (distance < 10 && distance > 5) {
					quality += (10 - distance) * 2;
				}
				if (distance < 5 && distance > -1) {
					quality += (5 - distance) * 3 + 10;
				}
				if (distance < 0) {
					quality = 0;
				}
			} else if (existDays > sellIn) {
				if (specialFlag == 1) {
					quality += existDays - sellIn;
				} else {
					quality -= (existDays - sellIn) * 2;
				}
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
