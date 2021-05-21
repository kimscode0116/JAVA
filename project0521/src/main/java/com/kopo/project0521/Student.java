package com.kopo.project0521;

public class Student {
	int idx;
	String name;
	int middleExam;
	int finalExam;
	String time;
	
	Student() {
		
	}
	
	Student(String stuName, int midScore, int finScore, String now) {
		this.name = stuName;
		this.middleExam = midScore;
		this.finalExam = finScore;
		this.time = now;
	}
	Student(int idx, String stuName, int midScore, int finScore, String now) {
		this.idx = idx;
		this.name = stuName;
		this.middleExam = midScore;
		this.finalExam = finScore;
		this.time = now;
	}
}
