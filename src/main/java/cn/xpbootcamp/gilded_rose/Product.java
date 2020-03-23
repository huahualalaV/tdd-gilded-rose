package cn.xpbootcamp.gilded_rose;

/**
 * @ClassName Product
 * @Description TODO
 * @Author zijie.jiang
 * @Date 2020-03-21 19:30
 * @Version 1.0
 */
public class Product {
	public static final String AGED_BRIE = "Aged Brie";
	public static final String SULFURAS = "Sulfuras";
	public static final String BACKSTAGE_PASS = "Backstage pass";

	private Integer sellIn;
	private Integer quality;
	private Integer existedDays = 0;
	private String name = "";

	public Product(Integer sellIn, Integer quality) {
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public Product(Integer sellIn, Integer quality, Integer existedDays) {
		this.sellIn = sellIn;
		this.quality = quality;
		this.existedDays = existedDays;
	}

	public Product(Integer sellIn, Integer quality, Integer existedDays, String name) {
		this.sellIn = sellIn;
		this.quality = quality;
		this.existedDays = existedDays;
		this.name = name;
	}

	public Integer getQuality() {
		if (!name.equals(SULFURAS)) {
			if (name.equals(BACKSTAGE_PASS)) {
				int differenceValue = sellIn - existedDays;
				if (differenceValue < 10 && differenceValue > 5) {
					quality += sellIn - 10;
					quality += (10 - differenceValue) * 2;
				}
				if (differenceValue < 5 && differenceValue > -1) {
					quality += sellIn - 10;
					quality += (5 - differenceValue) * 3 + 10;
				}
				if (differenceValue < 0) {
					quality = 0;
				}
			} else if (existedDays > sellIn) {
				if (name.equals(AGED_BRIE)) {
					quality += existedDays;
				} else {
					quality -= sellIn;
					quality -= (existedDays - sellIn) * 2;
				}
			}
		}

		ensureQuality();
		return quality;
	}

	private void ensureQuality() {
		if (quality < 0) {
			quality = 0;
		}
		if (quality > 50) {
			quality = 50;
		}
	}
}
