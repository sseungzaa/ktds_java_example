package com.ktdsuniversity.edu.fp.stream.file;

import java.util.ArrayList;
import java.util.List;

public class State {
	private int id;
	private String name;
	private int countryId;
	private String countryCode;
	private String countryName;
	private String stateCode;
	private String type;
	private double latitude;
	private double longitude;
	// 여기부터 has a 강의 추가 부분
	private Country countryInfo;
	private List<City> cities;
	// 여기까지
	
	public State(String[] stateData) {
		
		this(
			Integer.parseInt(stateData[0]), // id
			stateData[1], // name
			Integer.parseInt(stateData[2]), // countryId
			stateData[3], // countryCode
			stateData[4], // countryName
			stateData[5], // stateCode
			stateData[6], // type
//			Double.parseDouble(stateData[7]), // latitude
//			Double.parseDouble(stateData[8]) // longitude
			stateData.length > 7 ? Double.parseDouble(stateData[7]) : 0,
			stateData.length > 8 ? Double.parseDouble(stateData[8]) : 0
			);
		
	}
	
	public State(int id, String name, int countryId, String countryCode, String countryName, String stateCode,
			String type, double latitude, double longitude) {
		this.id = id;
		this.name = name;
		this.countryId = countryId;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.stateCode = stateCode;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
		// 여기부터 has a 강의 추가 부분
		this.cities = new ArrayList<>();
		// 여기까지
	}
	
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public String getType() {
		return this.type;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	// 여기부터 has a 강의 추가 부분
	public Country getCountryInfo() {
		return this.countryInfo;
	}
	
	public List<City> getCities() {
		return this.cities;
	}

	public void setCountryInfo(Country countryInfo) {
		this.countryInfo = countryInfo;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	// 여기까지
	
}
