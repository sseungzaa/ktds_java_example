package com.ktdsuniversity.edu.fp.stream.file;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private int id;
	private String name;
	private String wikiDataId;
	// 여기부터 has a 강의 추가 부분
	private List<SubRegion> subRegions;
	// 여기까지
	
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
		// 여기부터 has a 강의 추가 부분
		this.subRegions = new ArrayList<>();
		// 여기까지
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

	// 여기부터 has a 강의 추가 부분
	public List<SubRegion> getSubRegions() {
		return this.subRegions;
	}

	public void setSubRegions(List<SubRegion> subRegions) {
		this.subRegions = subRegions;
	}
	// 여기까지
	
}
