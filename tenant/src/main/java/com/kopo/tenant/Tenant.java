package com.kopo.tenant;

public class Tenant {
	int idx;
	String name;
	int age;
	String gender;
	int aptIdx;
	
	Tenant() {
		
	}
	//아파트 추가 부분입니다.
//	Tenant(String usrName, int usrAge, String usrGender, int aptIdx) {
//		this.name = usrName;
//		this.age = usrAge;
//		this.gender = usrGender;
//		this.aptIdx = aptIdx;
//	}
	
	Tenant(String usrName, int usrAge, String usrGender) {
		this.name = usrName;
		this.age = usrAge;
		this.gender = usrGender;
	}
	
	Tenant(int idx, String usrName, int usrAge, String usrGender) {
		this.idx = idx;
		this.name = usrName;
		this.age = usrAge;
		this.gender = usrGender;
	}
}
