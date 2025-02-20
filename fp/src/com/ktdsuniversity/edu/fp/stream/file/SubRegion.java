package com.ktdsuniversity.edu.fp.stream.file;

import java.util.ArrayList;
import java.util.List;

public class SubRegion {
	private int id;
	private String name;
	private int regionId;
	private String wikiDataId;
	// 여기부터 has a 강의 추가 부분
	private Region regionInfo;
	private List<Country> countries;
	// 여기까지
	
	public SubRegion(String[] subRegionData) {
		this (
			 Integer.parseInt(subRegionData[0]), // id
			 subRegionData[1], // name
			 Integer.parseInt(subRegionData[2]), // regionId
			 subRegionData[3] // wikiDataId
			 );
	}

	public SubRegion(int id, String name, int regionId, String wikiDataId) {
		this.id = id;
		this.name = name;
		this.regionId = regionId;
		this.wikiDataId = wikiDataId;
		// 여기부터 has a 강의 추가 부분
		this.countries = new ArrayList<>();
		// 여기까지
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getRegionId() {
		return this.regionId;
	}

	public String getWikiDataId() {
		return this.wikiDataId;
	}

	// 여기부터 has a 강의 추가 부분
	public Region getRegion() {
		return this.regionInfo;
	}
	
	public List<Country> getCountries() {
		return this.countries;
	}

	public void setRegion(Region region) {
		this.regionInfo = region;
	}

	public void setCountries(List<Country> contries) {
		this.countries = contries;
	}
	// 여기까지
	
}
