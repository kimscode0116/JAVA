package com.apartment.tenant;

public class Tenant {
	int idx;
	String name;
	int age;
	String gender;
	
	
	Tenant() {
		
	}
	Tenant(String usrName, int usrAge, String usrGender) {
		this.name = usrName;
		this.age = usrAge;
		this.gender = usrGender;
	}
}
