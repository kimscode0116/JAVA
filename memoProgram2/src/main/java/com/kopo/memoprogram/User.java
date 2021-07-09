package com.kopo.memoprogram;

public class User {
	int idx;
	String id;
	String pwd;
	String name;
	String birthday;
	String address;
	String joindate;
	
	User() {
		
	}
	
	User(int userIdx) {
		this.idx = userIdx;
	}
	User(String userid) {
		this.id = userid;
	}
	
	User(String newId, String newPwd, String name, String birthday, String address, String joindate) {
		this.id = newId;
		this.pwd = newPwd;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.joindate = joindate;
	}
	
	User(int userIdx, String userId, String userPwd) {
		this.idx = userIdx;
		this.id = userId;
		this.pwd = userPwd;
	}
	
	User(String userId, String userPwd) {
		this.id = userId;
		this.pwd = userPwd;
	}
}
