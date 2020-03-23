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
				if (existedDays <= sellIn) {
					if (sellIn >= 10) {
						if (existedDays < sellIn - 10) {
							quality += existedDays;
						} else if (existedDays < sellIn - 5) {
							quality += sellIn - 10;
							quality += (10 + existedDays - sellIn) * 2;
						} else {
							quality += sellIn - 10;
							quality += 5 * 2;
							quality += (5 + existedDays - sellIn) * 3;
						}
					} else if (sellIn >= 5) {
						if (existedDays <= sellIn -5) {
							quality += existedDays * 2;
						} else {
							quality += (sellIn - 5) * 2;
							quality += (5 + existedDays -sellIn) * 3;
						}
					} else {
						quality += existedDays * 3;
					}
				} else {
					quality = 0;
				}
			} else if (name.equals(AGED_BRIE)) {
				quality += existedDays;
			} else if (existedDays > sellIn) {
				quality -= sellIn;
				quality -= (existedDays - sellIn) * 2;
			} else {
				quality -= existedDays;
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
