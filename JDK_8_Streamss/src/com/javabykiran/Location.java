package com.javabykiran;

public class Location {
	String areaCode;
	String landMark;
	public String getAreaCode() {
		return areaCode;
	}
	public Location(String areaCode, String landMark) {
		super();
		this.areaCode = areaCode;
		this.landMark = landMark;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
}
