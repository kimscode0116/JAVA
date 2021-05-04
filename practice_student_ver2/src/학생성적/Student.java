package 학생성적;

public class Student {

	String name;
	int midScore = 0;
	int finScore = 0;
	int total = 0;
	double avg = 0;
	int rank = 1;
	
	Student(String name) {
		this.name = name;
	}
	
	public void clac() {
		this.total = this.midScore + this.finScore;
		this.avg = (double)this.total/2;
	}

}
