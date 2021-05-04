
public class Student {
	String name;
	int middleScore;
	int finalScore;
	int sum;
	int avg;

	Student(String name) {
		this.name = name;
	}

	public void clacScore() {
		sum = middleScore + finalScore;
		avg = sum/2;
	}

	@Override
	public String toString() {
		super.toString();
		return "" + "이름 : " + this.name + "(" + "중간성적 : " + this.middleScore + ", " + "기말성적 : " + this.finalScore + ", "
				+ "총점 : " + this.sum + ", " + "평균 : " + this.avg + ")" + " " + "\n";
	}

}
