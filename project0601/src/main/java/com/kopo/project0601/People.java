package com.kopo.project0601;

public class People {
	int idx;
	String id;
	String pwd;
	String name;
	String birthday;
	String address;
	String created;
	String updated;

	People() {

	}

	People(String userId, String userPwd, String userName, String userBirthday, String userAddress, String nowtime,
			String updateTime) {
		this.id = userId;
		this.pwd = userPwd;
		this.name = userName;
		this.birthday = userBirthday;
		this.address = userAddress;
		this.created = nowtime;
		this.updated = updateTime;
	}
	
	People(int idx, 
			String userId, 
			String userPwd, 
			String userName, 
			String userBirthday, 
			String userAddress, 
			String createdTime,
			String updateTime) {
		this.idx = idx;
		this.id = userId;
		this.pwd = userPwd;
		this.name = userName;
		this.birthday = userBirthday;
		this.address = userAddress;
		this.updated = updateTime;
	}
}
