package com.kopo.tenant;

public class Apartment {
	int idx;
	String aptName;
	
	Apartment() {
		
	}
	
	Apartment(String apartment) {
		this.aptName = apartment;
	}
	Apartment(int idx, String apartment) {
		this.idx = idx;
		this.aptName = apartment;
	}
}
