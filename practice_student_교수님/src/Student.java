
public class Student {
	String name;
	int middleScore;
	int finalScore;
	int sum;
	double avg;
	int rank;

	Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int middleScore, int finalScore) {
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
	}


	public void sumScore() {
		this.sum = this.middleScore + this.finalScore;
		this.avg = this.sum / (double)2;
	}

	@Override
	public String toString() {
		return "" + "이름 : " + this.name + "(" + "중간성적 : " + this.middleScore + ", " + "기말성적 : " + this.finalScore + ", "
				+ "\n";
	}

}
