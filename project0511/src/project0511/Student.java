package project0511;

public class Student implements Comparable<Student> {
	String name;
	int score;

	Student(String stuName, int stuScore) {
		this.name = stuName;
		this.score = stuScore;
	}

	@Override
	public int compareTo(Student o) {
		if (this.score < o.score) {
			return -1;
		} else if (this.score > o.score) {
			return 1;
		}
		return 0;
	}
}
