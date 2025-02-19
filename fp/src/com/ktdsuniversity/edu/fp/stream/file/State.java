package com.ktdsuniversity.edu.fp.stream.file;

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
		
}
