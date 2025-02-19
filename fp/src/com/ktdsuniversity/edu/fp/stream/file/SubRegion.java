package com.ktdsuniversity.edu.fp.stream.file;

public class SubRegion {
	private int id;
	private String name;
	private int regionId;
	private String wikiDataId;
	
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
	
}
