
public class StudentTeacher {
	String name;
	int midExam;
	int FinExam;

	int sum;
	
	StudentTeacher(String name, int midExam, int FinExam) {
		this.name = name;
		this.midExam = midExam;
		this.FinExam = FinExam;
		this.sumScore();

	}
	public void sumScore() {
		this.sum = this.midExam + this.FinExam;
	}
	@Override
	public String toString() {
		return "학생 이름 : " + this.name + " 중간고사 점수 : " + this.midExam + " 기말고사 점수 : " + this.FinExam + " 시험 총점 : "
				+ this.sum + " 총점 평균 : "  + "\n";
	}
}
