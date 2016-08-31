package com.saegusa.retype.ref;

public enum Locale {

	ENGLISH("en_GB"),
	FRENCH("fr_FR"),
	TURKISH("tr_TR");
	
	private String tag;
	
	Locale(String tag) {
		this.tag = tag;
	}
	
	public String getTag() {
		return tag;
	}
	
}
