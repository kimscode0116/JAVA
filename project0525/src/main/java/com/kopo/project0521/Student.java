package com.kopo.project0521;

public class Student {
	int idx;
	String name;
	double middleExam;
	double finalExam;
	String time;
	
	Student() {
		
	}
	
	Student(String stuName, double midScore, double finScore, String now) {
		this.name = stuName;
		this.middleExam = midScore;
		this.finalExam = finScore;
		this.time = now;
	}
	Student(int idx, String stuName, double midScore, double finScore, String now) {
		this.idx = idx;
		this.name = stuName;
		this.middleExam = midScore;
		this.finalExam = finScore;
		this.time = now;
	}
}
