package com.kopo.student;

public class Student {
	int idx;
	String name;
	int score;
	int middleScore;
	int finalScore;

	Student() {
	}

	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	Student(String name, int middle, int finalScore) {
		this.name = name;
		this.middleScore = middle;
		this.finalScore = finalScore;
	}

}
