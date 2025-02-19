package com.ktdsuniversity.edu.fp.stream.file;

public class Region {
	private int id;
	private String name;
	private String wikiDataId;
	
	public Region(String[] regionData) {
		this (
			 Integer.parseInt(regionData[0]), // id
			 regionData[1], // name
			 regionData[2] // wikiDataId
			 );
	}

	public Region(int id, String name, String wikiDataId) {
		this.id = id;
		this.name = name;
		this.wikiDataId = wikiDataId;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getWikiDataId() {
		return this.wikiDataId;
	}
}
