package com.ktdsuniversity.edu.fp.stream.file;

public class Country {
	private int id;
	private String name;
	private String iso3;
	private String iso2;
	private int numericCode;
	private int phoneCode;
	private String capital;
	private String currency;
	private String currencyName;
	private String currencySymbol;
	private String tld;
	private String nativeTranslate;
	private String region;
	private int regionId;
	private String subRegion;
	private int subRegionId;
	private String nationality;
	private String timezones;
	private double latitude;
	private double longitude;
	private String emoji;
	private String emojiU;
	
	public Country(String[] countryData) {
		this(
			Integer.parseInt(countryData[0]), // id
			countryData[1], // name
			countryData[2], // iso3
			countryData[3], // iso2
			Integer.parseInt(countryData[4]), // numericCode
			Integer.parseInt(countryData[5]), // phoneCode
			countryData[6], // capital
			countryData[7], // currency
			countryData[8], // currencyName
			countryData[9], // currencySymbol
			countryData[10], // tld
			countryData[11], // nativeTranslate
			countryData[12], // region
			Integer.parseInt(countryData[13]), // regionId
			countryData[14], // subRegion
			Integer.parseInt(countryData[15]), // subRegionId
			countryData[16], // nationality
			countryData[17], // timezones
			Double.parseDouble(countryData[18]), // latitude
			Double.parseDouble(countryData[19]), // longitude
			countryData[20], // emoji
			countryData[21] // emojiU
			);
	}
	
	public Country(int id, String name, String iso3, String iso2, int numericCode, int phoneCode, String capital,
			String currency, String currencyName, String currencySymbol, String tld, String nativeTranslate,
			String region, int regionId, String subRegion, int subRegionId, String nationality, String timezones,
			double latitude, double longitude, String emoji, String emojiU) {
		this.id = id;
		this.name = name;
		this.iso3 = iso3;
		this.iso2 = iso2;
		this.numericCode = numericCode;
		this.phoneCode = phoneCode;
		this.capital = capital;
		this.currency = currency;
		this.currencyName = currencyName;
		this.currencySymbol = currencySymbol;
		this.tld = tld;
		this.nativeTranslate = nativeTranslate;
		this.region = region;
		this.regionId = regionId;
		this.subRegion = subRegion;
		this.subRegionId = subRegionId;
		this.nationality = nationality;
		this.timezones = timezones;
		this.latitude = latitude;
		this.longitude = longitude;
		this.emoji = emoji;
		this.emojiU = emojiU;
	}
	
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getIso3() {
		return this.iso3;
	}

	public String getIso2() {
		return this.iso2;
	}

	public int getNumericCode() {
		return this.numericCode;
	}

	public int getPhoneCode() {
		return this.phoneCode;
	}

	public String getCapital() {
		return this.capital;
	}

	public String getCurrency() {
		return this.currency;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}

	public String getCurrencySymbol() {
		return this.currencySymbol;
	}

	public String getTld() {
		return this.tld;
	}

	public String getNativeTranslate() {
		return this.nativeTranslate;
	}

	public String getRegion() {
		return this.region;
	}

	public int getRegionId() {
		return this.regionId;
	}

	public String getSubRegion() {
		return this.subRegion;
	}

	public int getSubRegionId() {
		return this.subRegionId;
	}

	public String getNationality() {
		return this.nationality;
	}

	public String getTimezones() {
		return this.timezones;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public String getEmoji() {
		return this.emoji;
	}

	public String getEmojiU() {
		return this.emojiU;
	}
	
}
