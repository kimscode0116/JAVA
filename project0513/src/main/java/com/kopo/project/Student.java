package com.kopo.project;

public class Student {
	int idx; //DB에 들어간 공유값
	String name;
	int score;
	
	Student() {
		
	}
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
