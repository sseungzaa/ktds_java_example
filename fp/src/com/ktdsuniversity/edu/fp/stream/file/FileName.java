package com.ktdsuniversity.edu.fp.stream.file;

public enum FileName {
	
	CITIES("cities.csv"),
	COUNTRIES("countries.csv"),
	REGIONS("regions.csv"),
	STATES("states.csv"),
	SUBREGIONS("subregions.csv");
	
	
	public String fileName;
	
	FileName(String fileName) {
		this.fileName = fileName;
	}
}
